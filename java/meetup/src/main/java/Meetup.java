import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Meetup {
    private int month;
    private int year;

    Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule) {
        switch (schedule) {
            case FIRST:
                return getDate(1, TemporalAdjusters.dayOfWeekInMonth(1, dayOfWeek));
            case SECOND:
                return getDate(1, TemporalAdjusters.dayOfWeekInMonth(2, dayOfWeek));
            case THIRD:
                return getDate(1, TemporalAdjusters.dayOfWeekInMonth(3, dayOfWeek));
            case FOURTH:
                return getDate(1, TemporalAdjusters.dayOfWeekInMonth(4, dayOfWeek));
            case TEENTH:
                return getDate(12, TemporalAdjusters.next(dayOfWeek));
            case LAST:
                return getDate(1, TemporalAdjusters.lastInMonth(dayOfWeek));
            default:
                return LocalDate.now();
        }
    }

    private LocalDate getDate(int firstDay, TemporalAdjuster temporalAdjuster) {
        return  LocalDate.of(year, month, firstDay).with(temporalAdjuster);
    }
}
