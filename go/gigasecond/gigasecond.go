package gigasecond

import "time"

const gigaSecond = time.Duration(1e9) * time.Second

// AddGigasecond : determine the moment that would be after a gigasecond has passed
func AddGigasecond(t time.Time) time.Time {
	return t.Add(gigaSecond)
}
