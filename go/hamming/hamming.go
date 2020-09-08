// Package hamming : contain functions to calculate the Hamming Distance between two DNA strands.
package hamming

import "errors"

// Distance : Calculate the Hamming Distance between two DNA strands.
func Distance(a, b string) (int, error) {
	if len(a) != len(b) {
		return 0, errors.New("string has different lengths")
	}

	distance := 0
	target := []rune(b)
	for i, c := range a {
		if c != target[i] {
			distance++
		}
	}

	return distance, nil
}
