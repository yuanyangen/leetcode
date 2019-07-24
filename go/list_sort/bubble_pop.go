package list_sort


func sortList(start *ListNode) *ListNode {
	return bubleSortList(start)
}

func bubleSortList(start *ListNode) *ListNode {
	count := 0
	current := start
	for current != nil {
		count ++
		current = current.Next
	}
	for i := 0; i < count; i++ {
		current = start
		for j := 0; j < count - i; j ++ {
			if current.Next != nil && current.Val > current.Next.Val {
				t := current.Val
				current.Val = current.Next.Val
				current.Next.Val = t
			}
			current = current.Next
		}
	}
	return start
}
