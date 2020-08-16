// Package triangle : functions to indetify different types of triangles
package triangle

import (
	"math"
)

// Kind : type of triangle
type Kind string

const (
	//NaT : Not a Triangle
	NaT Kind = "Not a Triangle"
	//Equ : Equilateral Triangle
	Equ Kind = "Equilateral"
	//Iso : Isosceles Triangle
	Iso Kind = "Isosceles"
	//Sca : Scalene Triangle
	Sca Kind = "Scalene"
)

// KindFromSides : function to indetify the type of triagle base on his sides
func KindFromSides(a, b, c float64) Kind {

	if isATriangle(a, b, c) && (a == b && b == c) {
		return Equ
	}

	if isATriangle(a, b, c) && (a == b || b == c || a == c) {
		return Iso
	}

	if isATriangle(a, b, c) {
		return Sca
	}

	return NaT
}

func isATriangle(a, b, c float64) bool {
	sides := []float64{a, b, c}

	for _, side := range sides {
		if side <= 0 || math.IsNaN(side) || math.IsInf(side, 0) {
			return false
		}
	}

	if a+b < c || a+c < b || b+c < a {
		return false
	}

	return true
}
