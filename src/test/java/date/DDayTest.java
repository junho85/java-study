package date;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

public class DDayTest {
    @Test
    public void test() {
        LocalDate startDate = LocalDate.of(2020, 3, 17);
        LocalDate endDate = LocalDate.of(2020, 3, 18);

        assertThat(Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays()).isEqualTo(1);
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

    private Long getDDay(Calendar theDay) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        return (theDay.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 24 * 1000);
    }

    @Test
    public void test2() {
        Calendar calStart = Calendar.getInstance();
        Calendar calEnd = Calendar.getInstance();

        calStart.set(2020, 3-1, 17);
        calEnd.set(2020, 3-1, 19);

        assertThat(getDiffDays(calStart, calEnd)).isEqualTo(2);
    }

    @Test
    public void test3() {
        Calendar theDay = Calendar.getInstance();
        int days = 10;
        theDay.add(Calendar.DATE, days);

        assertThat(getDDay(theDay)).isEqualTo(days);
    }
}
