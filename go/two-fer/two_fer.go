// Package twofer : This package offers a simple message app based on a given name.
package twofer

import "fmt"

// ShareWith is two-fer game implementation
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}
	return fmt.Sprintf("One for %s, one for me.", name)
}
