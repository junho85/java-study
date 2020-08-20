package date;


import org.junit.Test;

import java.time.OffsetDateTime;

public class OffsetDateTimeTest {
    @Test
    public void test() {
        OffsetDateTime date = OffsetDateTime.parse("2020-08-20T19:01:02+09:00");
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getHour());
        System.out.println(date.getMinute());
        System.out.println(date.getSecond());
    }
}
