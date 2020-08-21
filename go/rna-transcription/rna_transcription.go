// Package strand : function to work and transcript DNA into RNA
package strand

var transcript = map[rune]rune{
	'G': 'C',
	'C': 'G',
	'T': 'A',
	'A': 'U',
}

// ToRNA : function to transcript a DNA string into a RNA string
func ToRNA(dna string) string {
	rna := make([]rune, len(dna))

	for i, n := range dna {
		rna[i] = transcript[n]
	}

	return string(rna)
}
