public class SpaceAge {
    private double seconds;
    private static final double SECONDS_PER_YEAR = 31557600;
    private static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
    private static final double VENUS_ORBITAL_PERIOD = 0.61519726;
    private static final double MARS_ORBITAL_PERIOD = 1.8808158;

    public SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return seconds;
    }

    public double onEarth() {
        return seconds / SECONDS_PER_YEAR;
    }

    public double onMercury() {
        return getAgefor(MERCURY_ORBITAL_PERIOD);
    }

    public double onVenus() {
        return getAgefor(VENUS_ORBITAL_PERIOD);
    }

    public double onMars() {
        return getAgefor(MARS_ORBITAL_PERIOD);
    }

    public double onJupiter() {
        return 0;
    }

    public double onSaturn() {
        return 0;
    }

    public double onNeptune() {
        return 0;
    }

    public double onUranus() {
        return 0;
    }

    private double getAgefor(double orbitalPeriod) {
        return this.onEarth() / orbitalPeriod;
    }
}
