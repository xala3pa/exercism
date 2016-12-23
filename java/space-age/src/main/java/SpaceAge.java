public class SpaceAge {
    public static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
    private double seconds;
    private static final double SECONDS_PER_YEAR = 31557600;

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
        return this.onEarth() / MERCURY_ORBITAL_PERIOD;
    }

    public double onVenus() {
        return 0;
    }

    public double onMars() {
        return 0;
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
}
