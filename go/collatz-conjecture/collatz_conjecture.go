// Package collatzconjecture : contains functions to solve 3x+1 problem
package collatzconjecture

import (
	"errors"
)

// CollatzConjecture : function to solve 3x+1 problem
func CollatzConjecture(number int) (int, error) {
	if number < 1 {
		return -1, errors.New("function doesn't work with a negative or zero number")
	}

	counter := 0
	for ;  number > 1; number = step(number) {
		counter++
	}

	return counter, nil
}

func step(n int) int {
	if n%2 == 0 {
		return n / 2
	}
	return n*3 + 1
}
