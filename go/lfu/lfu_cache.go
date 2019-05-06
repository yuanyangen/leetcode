package lfu

type LFUCache struct {
	head *LfuFeqNode
	tail *LfuFeqNode
	data map[int]*LFUDataNode
	cap int
	size int
}

type LfuFeqNode struct {
	usedTimes int
	prev *LfuFeqNode
	next *LfuFeqNode
	dataHead  *LFUDataNode
	dataTail *LFUDataNode
}

type LFUDataNode struct {
	key int
	value int
	prev *LFUDataNode
	next *LFUDataNode
    feqNode *LfuFeqNode
}


func Constructor(capacity int) LFUCache {
	return LFUCache{
		cap:capacity,
		data: map[int]*LFUDataNode{},
	}
}


func (this *LFUCache) Get(key int) int {
	caches := this.data
	v, ok :=caches[key]
	if !ok {
		return -1
	}

	// 从当前的feq节点中删除数据节点
	oldFeqNode := v.feqNode
	this.removeDataNodeToFeqNode(oldFeqNode, v)
	feqNode := v.feqNode.prev
	if feqNode== nil {
		//在中间新建一个
		feqNode = &LfuFeqNode{
			usedTimes:v.feqNode.usedTimes+1,
			next:oldFeqNode,
		}
	}
	this.addDataNodeToFeqNode(feqNode, v)
	return v.value
}


func (this *LFUCache) Put(key int, value int) {
	if this.size >= this.cap {
		this.removeLastOneNode()
	}
	node := &LFUDataNode{
		key:key,
		value:value,
	}

	feqNode := this.tail
	if feqNode == nil {
		feqNode = &LfuFeqNode{
			usedTimes:1,
			prev:this.tail,
		}
		this.tail = feqNode
		this.head = feqNode
	}

	if feqNode.usedTimes == 0 {
		this.addDataNodeToFeqNode(feqNode, node)
	} else {
		feqData := &LfuFeqNode{
			usedTimes:0,
			prev:this.tail,
			dataHead:node,
			dataTail:node,
		}
		node.feqNode = feqData
		this.tail = feqData
	}
	this.data[key] = node
	this.size++
}

func (this *LFUCache) addDataNodeToFeqNode(feqNode *LfuFeqNode, node *LFUDataNode) {
	node.feqNode = feqNode
	if feqNode.dataHead == nil {
		feqNode.dataHead = node
		feqNode.dataTail = node
	} else {
		node.next = feqNode.dataHead
		node.next.prev = node
		feqNode.dataHead = node
	}
}

func (this *LFUCache) removeDataNodeToFeqNode(feqNode *LfuFeqNode, dataNode *LFUDataNode) {
	if feqNode.dataHead == feqNode.dataTail {
		feqNode.dataHead = nil
		feqNode.dataTail = nil
	} else {
		cur := feqNode.dataHead
		if feqNode.dataHead ==  feqNode.dataTail {
			feqNode.dataTail = nil
			feqNode.dataHead = nil
		}
		for cur != nil {
			if cur.key == dataNode.key {
				if cur.prev == nil {
					feqNode.dataHead = cur.next
				} else {
					cur.prev.next = cur.next
					if cur.next != nil {
						cur.next.prev = cur.prev
					}
				}
				break
			}
			cur = cur.next
		}
	}
}

//删除一个元素
func (this *LFUCache) removeLastOneNode() {
	tailNode := this.tail
	if tailNode.dataTail == tailNode.dataHead {
		key := tailNode.dataHead.key
		delete(this.data, key)
		this.tail = tailNode.prev
	} else {
		key := tailNode.dataTail.key
		delete(this.data, key)
		tailNode.dataTail.prev.next = nil
	}
	this.size--
}
