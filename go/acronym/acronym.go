// Package acronym : function to abbreviate a sentence.
package acronym

import (
	"strings"
)

// Abbreviate function to find the acronym of a any sentence.
func Abbreviate(s string) (ab string) {

	r := strings.FieldsFunc(s, split)

	acronym := ""
	for _, word := range r {
		acronym += strings.ToUpper(word[0:1])
	}
	return acronym
}

func split(r rune) bool {
	return r == ' ' || r == ',' || r == '-' || r == '_'
}
