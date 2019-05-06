package lfu

import (
	"fmt"
	"testing"
)

func TestLfu(t *testing.T) {
	cache := Constructor(2)

	cache.Put(1, 1)
	cache.Put(2, 2)
	fmt.Println(cache.Get(1))       // returns 1
	cache.Put(3, 3)    // evicts key 2
	fmt.Println(cache.Get(2))      // returns -1 (not found)
	fmt.Println(cache.Get(3))       // returns 3.
	cache.Put(4, 4)  // evicts key 1.
	fmt.Println(cache.Get(1))       // returns -1 (not found)
	fmt.Println(cache.Get(3))     // returns 3
	fmt.Println(cache.Get(4))       // returns 4
}
