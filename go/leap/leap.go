// Package leap : funcitions to know if year is leap
package leap

// IsLeapYear : given a year return if year is leap
func IsLeapYear(year int) bool {
	return year%4 == 0 && (year%100 != 0 || year%400 == 0)
}
