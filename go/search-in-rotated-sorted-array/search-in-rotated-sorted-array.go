package search_in_rotated_sorted_array

func search0(nums []int, target int) int {
	for i,v := range nums {
		if v == target {
			return i
		}
	}
	return -1
}



func search(nums []int, target int) int {
	if len(nums) <= 0 {
		return -1
	}
	start := 0
	for i := 1; i < len(nums); i++ {
		if nums[i-1] > nums[i] {
			start = i
			break
		}
	}
	left := 0
	right := len(nums)-1

	for left != right {
		mid := (left + right)/2
		realMid := convertOldIndexToNew(mid, start, len(nums))
		if nums[realMid] < target {
			left = mid + 1
		} else if nums[realMid] > target {
			right = right -1
		} else {
			return realMid
		}
	}
	if nums[convertOldIndexToNew(left, start, len(nums))] != target {
		return -1

	} else {
		return convertOldIndexToNew(left, start, len(nums))
	}
}

func convertOldIndexToNew(i int, start int, len int) int {
	return (i + start) % len
}
