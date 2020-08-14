package space

//Planet : name of the planet
type Planet string

const earthYearSeconds = 31557600

var planetsYearsSeconds = map[Planet]float64{
	"Earth":   earthYearSeconds,
	"Mercury": earthYearSeconds * 0.2408467,
	"Venus":   earthYearSeconds * 0.61519726,
	"Mars":    earthYearSeconds * 1.8808158,
	"Jupiter": earthYearSeconds * 11.862615,
	"Saturn":  earthYearSeconds * 29.447498,
	"Uranus":  earthYearSeconds * 84.016846,
	"Neptune": earthYearSeconds * 164.79132,
}

//Age : function to calculate the age base on a planet obrital period
func Age(ageInSeconds float64, planet Planet) float64 {
	return ageInSeconds / planetsYearsSeconds[planet]
}
