package lastRemaining

//https://leetcode-cn.com/problems/elimination-game/submissions/

// 证明： https://blog.csdn.net/afei__/article/details/83689502


func lastRemaining(n int) int {
	if n == 1 {
		return 1
	} else {
		return  2 * (n / 2 + 1 - lastRemaining(n / 2))
	}
}