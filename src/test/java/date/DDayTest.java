package date;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.assertj.core.api.Assertions.assertThat;

public class DDayTest {
    @Test
    public void ddayLocalDate() {
        LocalDate fromDate = LocalDate.of(2020, 8, 21);
//        LocalDate fromDate = LocalDate.now();
        LocalDate toDate = LocalDate.of(2020, 8, 22);

        // ChronoUnit.DAYS.between
        System.out.println(DAYS.between(fromDate, toDate));
        assertThat(DAYS.between(fromDate, toDate))
                .isEqualTo(1);

        // until
        System.out.println(fromDate.until(toDate, DAYS));
        assertThat(fromDate.until(toDate, DAYS))
                .isEqualTo(1);

        // Duration.between
        System.out.println(Duration.between(fromDate.atStartOfDay(), toDate.atStartOfDay()).toDays()); // 1
        assertThat(Duration.between(fromDate.atStartOfDay(), toDate.atStartOfDay()).toDays())
                .isEqualTo(1);
    }

    @Test
    public void ddayLocalDate2() {
        LocalDate fromDate = LocalDate.of(2020, 8, 21);
        LocalDate toDate = LocalDate.of(2020, 9, 20);

        assertThat(Duration.between(fromDate.atStartOfDay(), toDate.atStartOfDay()).toDays())
                .isEqualTo(30);
    }

    @Test
    public void ddayCalendar() {
        Calendar calStart = Calendar.getInstance();
        Calendar calEnd = Calendar.getInstance();

        calStart.set(2020, 3-1, 17);
        calEnd.set(2020, 3-1, 19);

        assertThat(getDiffDays(calStart, calEnd)).isEqualTo(2);
    }

    /**
     *
     * @param calStart
     * @param calEnd
     * @return
     */
    private Long getDiffDays(Calendar calStart, Calendar calEnd) {
        return (calEnd.getTimeInMillis() - calStart.getTimeInMillis()) / (60 * 60 * 24 * 1000);
    }

    @Test
    public void ddayCalendar2() {
        Calendar theDay = Calendar.getInstance();
        int days = 10;
        theDay.add(Calendar.DATE, days);

        assertThat(getDDay(theDay)).isEqualTo(days);
    }

    private Long getDDay(Calendar theDay) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        return (theDay.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 24 * 1000);
    }
}
