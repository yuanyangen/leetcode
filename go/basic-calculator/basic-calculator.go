package basic_calculator

import (
	"strconv"
	"strings"
)

type Node struct {
	IsLeaf bool
	Oper   string
	Children []*Node
	Value  int
}

// 最终计算结果不会超出int32
func calculate(s string) int {
	node := parseString(s)
	return calcNode(node)
}

func parseString(s string) []*Node {
	var ret []*Node
	//cleanSpace
	strings.Replace(s, " ", "", -1)
	if s[0] == '(' && s[len(s)-1] == ')' {
		return parseString(s[1:len(s)-1])
	}
	breakCount := 0
	lastPos := 0
	lastOper := "+"

	for i :=0; i < len(s); i++ {
		if (s[i] == '+' || s[i] == '-') && breakCount == 0 {
			ret = append(ret, &Node{
				Oper:string(lastOper),
				IsLeaf: false,
				Children:parseString(s[lastPos:i]),
			})
			lastOper = string(s[i])
			lastPos = i+1
		}
		if s[i] == '(' {
			if breakCount == 0 {
				lastPos = i
			}
			breakCount ++
		} else if s[i] == ')' {
			breakCount--
			if breakCount == 0 {
				ret = append(ret, &Node{
					IsLeaf: false,
					Oper:string(lastOper),
					Children:parseString(s[lastPos:i+1]),
				})
			}
		}
	}
	if len(ret)== 0 {
		v,_ := strconv.Atoi(s)
		ret = append(ret, &Node{
			Oper:lastOper,
			IsLeaf: true,
			Value:  v,
		})
	}
	return ret
}

var OperMap = map[string]func(int, int) int {
	"+": func(i int, i2 int) int {
		return i+i2
	},
	"-": func(i int, i2 int) int {
		return i-i2
	},
}

func calcNode(nodes  []*Node) int {
	i := 0
	for _,node := range nodes {
		if !node.IsLeaf {
			i = OperMap[node.Oper](i, calcNode(node.Children))
		} else {
			return node.Value
		}
	}
	return i
}

type Stack struct {
	data []interface{}
}

func NewStack() *Stack {
	return &Stack{data:[]interface{}{}}
}

func (s *Stack)Push(i interface{}) {
	s.data = append([]interface{}{i}, s.data)
}


func (s *Stack)Pop() interface{} {
	if len(s.data) == 0 {
		return nil
	}
	r := s.data[0]
	s.data = s.data[1:]
	return r
}

func (s *Stack)PopInt() int {
	return s.Pop().(int)
}

func (s *Stack)PopString() string {
	return s.Pop().(string)
}

func (s *Stack)Len() int {
	return len(s.data)
}