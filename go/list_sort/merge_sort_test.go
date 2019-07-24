package list_sort

import (
	"fmt"
	"testing"
)


func TestMergeSort(t *testing.T) {

	n :=  &ListNode{
		Val: 32154321,
	}
	start := n
	current := n

	n = &ListNode{
		Val: 3,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 23,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 3523,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 323,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 343,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 353456,
	}
	current.Next = n
	current = n
	n = &ListNode{
		Val: 365,
	}
	current.Next = n
	current = n

	//res := mergeSortList(start)
	res := bubleSortList(start)
	fmt.Println(res)
}