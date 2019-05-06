package originalDigits

import "strconv"

// https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/
// 思路， 英文数字是固定的， 所以根据特定的顺序计算所有字符的个数， 就能得到对应数字的个数， 最后拼装一下结果即可
var allChars = map[string]int{}
var resultSlice = make([]int, 10)
var charMap = []string{
	"zero","one","two","three","four","five","six","seven","eight","nine",
}
var uniqChar = []string{
	"z","o","w","r","u","f","s","v","g","i",
}
// 根据这个顺序计算， 有唯一性
var calSequence = []int{0,2,4,1,5,7,6,3,8,9}

func originalDigits(s string) string {
	for _, v := range s {
		if _, ok := allChars[string(v)]; ok {
			allChars[string(v)]++
		} else {
			allChars[string(v)] = 1
		}
	}
	for _, number := range calSequence {
		calc(number)
	}
	ret := ""
	for in,c := range resultSlice {
		if c >0 {
			for i:= 0; i < c ; i++ {
				ret = ret + strconv.Itoa(in)
			}
		}
	}
	return ret
}


func calc(number int) {
	c := uniqChar[number]
	count := countOfChar(c)
	if count > 0 {
		resultSlice[number] = count
		chars := charMap[number]
		for _,ch := range chars {
			allChars[string(ch)] = allChars[string(ch)] - count
		}
	}
}

func countOfChar(c string) int {
	if v, ok := allChars[c]; ok {
		return v
	} else {
		return 0
	}
}
