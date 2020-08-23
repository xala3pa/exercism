// Package acronym : function to abbreviate a sentence.
package acronym

import (
	"regexp"
	"strings"
)

// Abbreviate function to fet the acronym od a any sentence.
func Abbreviate(s string) (ab string) {
	s = strings.Replace(s, "-", " ", -1)
	s = strings.Replace(s, "_", "", -1)
	s = strings.Replace(s, "'", "", -1)
	
	r := regexp.MustCompile(`(\b\w)`)
	a := strings.Join(r.FindAllString(s, -1), "")

	return strings.ToUpper(a)
}