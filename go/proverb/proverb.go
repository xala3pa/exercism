// Package proverb : Given a list of inputs, generate a relevant proverb.
package proverb

import (
	"fmt"
)

const sentence = "For want of a %s the %s was lost."
const lastSentence = "And all for the want of a %s."

// Proverb : function given a list of inputs, generate the relevant proverb.
func Proverb(rhyme []string) []string {
	if len(rhyme) == 0 {
		return []string{}
	}

	s := make([]string, len(rhyme))
	s[len(rhyme)-1] = fmt.Sprintf(lastSentence, rhyme[0])

	previousWord := rhyme[0]
	for i, word := range rhyme[1:] {
		s[i] = fmt.Sprintf(sentence, previousWord, word)
		previousWord = word
	}
	
	return s
}
