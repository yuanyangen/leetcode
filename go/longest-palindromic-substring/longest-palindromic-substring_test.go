package longest_palindromic_substring

import (
	"fmt"
	"testing"
)

// https://leetcode-cn.com/problems/longest-palindromic-substring/description/

func TestLongestPalindrome(t *testing.T) {
	fmt.Println(longestPalindrome("cbbd"))
	fmt.Println(longestPalindrome("babad"))
}
