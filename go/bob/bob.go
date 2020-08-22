// Package bob : Contains function to talk to Bob
package bob

import (
	"strings"
	"unicode"
)

// Hey is the only way to comunicate with Bob
func Hey(remark string) string {
	s := strings.TrimSpace(remark)
	switch {
	case isQuestion(s) && isYelling(s):
		return "Calm down, I know what I'm doing!"
	case isQuestion(s):
		return "Sure."
	case isYelling(s):
		return "Whoa, chill out!"
	case isSilence(s):
		return "Fine. Be that way!"
	default:
		return "Whatever."
	}
}

func isYelling(s string) bool {
	hasLetters := strings.IndexFunc(s, unicode.IsLetter) >= 0
	isUpper := strings.ToUpper(s) == s

	return hasLetters && isUpper
}

func isQuestion(s string) bool {
	return strings.HasSuffix(s, "?")
}

func isSilence(s string) bool {
	return len(s) == 0	
}
