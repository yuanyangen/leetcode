package list_sort



func mergeSortList(start *ListNode) *ListNode {
	s1, s2 := Split(start)
	if s2 == nil {
		return s1
	}
	return Merge(mergeSortList(s1), mergeSortList(s2))
}

func Split(start1 *ListNode) (*ListNode, *ListNode) {
	s1 := start1
	count := 0
	if start1 == nil {
		return nil, nil
	}
	current := s1
	for current != nil {
		count++
		current = current.Next
	}
	middle := count / 2
	current = s1
	for i := 0; i < middle-1; i++ {
		current = current.Next
	}
	s2 := current.Next
	current.Next = nil
	return s1, s2
}

func Merge(s1, s2 *ListNode) *ListNode {
	var ret *ListNode
	var current *ListNode
	for !(s1 == nil && s2 == nil) {
		var node  *ListNode
		if s1 == nil {
			node = s2
			s2 = s2.Next
		} else if s2 == nil {
			node = s1
			s1 = s1.Next
		} else {
			if s1.Val <= s2.Val {
				node = s1
				s1 = s1.Next
			} else {
				node = s2
				s2 = s2.Next
			}
		}
		if ret == nil {
			ret = node
			current = node
		} else {
			current.Next = node
			current = node
		}
	}
	return ret
}
