import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

  private static final int GIGASECONDS = 1000_000_000;
  private final LocalDateTime localdateTime;

  Gigasecond(LocalDate birthDate) {
    localdateTime = LocalDateTime.of(birthDate, LocalTime.of(0, 0, 0)).plusSeconds(GIGASECONDS);
  }

  Gigasecond(LocalDateTime birthDateTime) {
    localdateTime = birthDateTime.plusSeconds(GIGASECONDS);
  }

  LocalDateTime getDate() {
    return localdateTime;
  }
}