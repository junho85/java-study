package date;

import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class LocalDateTest {
    @Test
    public void dateToLocalDate() throws ParseException {
        // Date to LocalDate
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2020-10-19");
        LocalDate localDate = parse.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // LocalDate to ZonedDateTime
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime); // 2020-10-19T00:00+09:00[Asia/Seoul]
    }

    @Test
    public void dateToLocalDate2() throws ParseException {
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");
        Date parse = fdf.parse("2020-10-19");
        LocalDate localDate = parse.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // LocalDate to ZonedDateTime
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime); // 2020-10-19T00:00+09:00[Asia/Seoul]
    }

    @Test
    public void localDateToZonedDateTime() {
        LocalDate localDate = LocalDate.parse("2020-10-19");
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime); // 2020-10-19T00:00+09:00[Asia/Seoul]
    }
}
