package date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class RestMonthDayTest {

    @Test
    public void test() {
        LocalDate startDate = LocalDate.of(2020, 3, 17);
        LocalDate endDate = LocalDate.of(2030, 4, 1);

        Period period = startDate.until(endDate);

        assertThat(period.getMonths()).isEqualTo(0);
        assertThat(period.getDays()).isEqualTo(15);
    }

    @Test
    public void test_parse_yyyymmdd() {
        DateTimeFormatter someFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate startDate = LocalDate.of(2020, 3, 17);
        LocalDate endDate = LocalDate.parse("20300401", someFormatter);

        Period period = startDate.until(endDate);

        assertThat(period.getMonths()).isEqualTo(0);
        assertThat(period.getDays()).isEqualTo(15);
    }

    @Test
    public void test2() {
        LocalDate startDate = LocalDate.now();
        System.out.println(startDate);

        DateTimeFormatter someFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate endDate = LocalDate.parse("20210312", someFormatter); // 11 months 23 days

        Period period = startDate.until(endDate);
        System.out.println("months: " + period.getMonths() + " days: " + period.getDays());
    }

    @Test
    public void test3() {
        LocalDate startDate = LocalDate.now();
        System.out.println(startDate);

        LocalDate endDate = LocalDate.of(2021, 3, 12); // 11 months 23 days

        Period period = startDate.until(endDate);
        System.out.println("months: " + period.getMonths() + " days: " + period.getDays());

    }

}
