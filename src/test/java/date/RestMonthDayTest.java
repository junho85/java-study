package date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class RestMonthDayTest {

    @Test
    public void test_test() {
        LocalDate theDate = LocalDate.of(2030, 4, 1);
        Period period = LocalDate.now().until(theDate);

        System.out.println(period.getYears() * 12 + period.getMonths() + "개월");
        System.out.println(period.getDays() + "일");
    }

    @Test
    public void test_rest_years_months_days() {
        LocalDate startDate = LocalDate.of(2020, 3, 17);
        LocalDate endDate = LocalDate.of(2030, 4, 1);

        Period period = startDate.until(endDate);

        assertThat(period.getYears()).isEqualTo(10);
        assertThat(period.getMonths()).isEqualTo(0);
        assertThat(period.getDays()).isEqualTo(15);
    }

    @Test
    public void test_rest_months_days() {
        LocalDate startDate = LocalDate.of(2020, 3, 17);
        LocalDate endDate = LocalDate.of(2030, 4, 1);

        Period period = startDate.until(endDate);

        assertThat(period.getYears() * 12 + period.getMonths()).isEqualTo(120);
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
        LocalDate endDate = LocalDate.of(2021, 3, 19);
        Period period = startDate.until(endDate);
        System.out.println("REST_MONTHS: " + period.getMonths() + ", REST_DAYS: " + period.getDays());
    }

    public static double monthsBetween(Date baseDate, Date dateToSubstract) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(baseDate);
        int baseDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        int baseYear = cal.get(Calendar.YEAR);

        cal.setTime(dateToSubstract);
        int subDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        int subYear = cal.get(Calendar.YEAR);

        return ((baseYear - subYear) * (cal.getMaximum(Calendar.MONTH) + 1)) +
                (baseDayOfYear - subDayOfYear) / 31.0;
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date startDate = sdf.parse("20200320");
        Date endDate = sdf.parse("20210319");
        double v = monthsBetween(startDate, endDate);

        int restMonths = Math.abs((int) v);
        int restDays = (int) (Math.abs((int) v * (-1) + v) / 0.032258064516129) + 1;

        System.out.println("REST_MONTHS: " + restMonths + ", REST_DAYS: " + restDays);
    }

    @Test
    public void test5() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        Date startDate = sdf.parse("19850520");
        Date startDate = sdf.parse("20120101");
//        Date startDate = sdf.parse("20200423");
        Date endDate = sdf.parse("20200424");

        // 12758
        // 3036

        long diff = endDate.getTime() - startDate.getTime();
        System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
//        System.out.println(diff);

//        DateTimeFormatter someFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        LocalDate startDate = LocalDate.parse("19850520", someFormatter);
//        LocalDate endDate = LocalDate.parse("20200424", someFormatter);


//        Period period = startDate.until(endDate);
//
//        System.out.println(period.getDays());
//        assertThat(period.getMonths()).isEqualTo(0);
//        assertThat(period.getDays()).isEqualTo(15);



    }

}
