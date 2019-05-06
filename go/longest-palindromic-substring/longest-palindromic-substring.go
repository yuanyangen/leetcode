package longest_palindromic_substring

// https://leetcode-cn.com/problems/longest-palindromic-substring/description/

func longestPalindrome(s string) string {
	ret := ""
	curLen := 0
	length := len(s)
	for i := 0; i < length-1; i++ {
		for j := 0; j <= i && j <= length-1-i; j++ {
			if s[i-j] != s[i+j] {
				//break
			} else {
				if j > curLen {
					ret = s[i-j : i+j+1]
					curLen = j
				}
			}
		}
	}
	return ret
}
