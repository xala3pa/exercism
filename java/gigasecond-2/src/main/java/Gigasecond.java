import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

  private static final int GIGASECONDS = 1_000_000_000;
  private final LocalDateTime localdateTime;

  Gigasecond(LocalDate birthDate) {
    this(birthDate.atStartOfDay());
  }

  Gigasecond(LocalDateTime birthDateTime) {
    localdateTime = birthDateTime.plusSeconds(GIGASECONDS);
  }

  LocalDateTime getDate() {
    return localdateTime;
  }
}