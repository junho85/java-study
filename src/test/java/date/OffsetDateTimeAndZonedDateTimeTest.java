package date;


import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class OffsetDateTimeAndZonedDateTimeTest {
    @Test
    public void test0() {
        OffsetDateTime oDate = OffsetDateTime.parse("2020-08-20T19:01:02+09:00");

        System.out.println(oDate); // 2020-08-20T19:01:02+09:00
        System.out.println(oDate.getYear()); // 2020
        System.out.println(oDate.getMonthValue()); // 8
        System.out.println(oDate.getDayOfMonth()); // 20
        System.out.println(oDate.getHour()); // 19
        System.out.println(oDate.getMinute()); // 1
        System.out.println(oDate.getSecond()); // 2
        System.out.println(oDate.getOffset()); // +09:00
    }

    @Test
    public void test() {
        System.out.println("==========");
        ZonedDateTime zDate = ZonedDateTime.parse("2020-08-20T19:01:02+09:00");

        System.out.println(zDate); // 2020-08-20T19:01:02+09:00
        System.out.println(zDate.getYear()); // 2020
        System.out.println(zDate.getMonthValue()); // 8
        System.out.println(zDate.getDayOfMonth()); // 20
        System.out.println(zDate.getHour()); // 19
        System.out.println(zDate.getMinute()); // 1
        System.out.println(zDate.getSecond()); // 2
        System.out.println(zDate.getOffset()); // +09:00
        System.out.println(zDate.getZone()); // +09:00

        System.out.println("==========");
        ZonedDateTime zDate2 = ZonedDateTime.parse("2020-08-20T19:01:02+09:00[Asia/Seoul]");

        System.out.println(zDate2); // 2020-08-20T19:01:02+09:00
        System.out.println(zDate2.getYear()); // 2020
        System.out.println(zDate2.getMonthValue()); // 8
        System.out.println(zDate2.getDayOfMonth()); // 20
        System.out.println(zDate2.getHour()); // 19
        System.out.println(zDate2.getMinute()); // 1
        System.out.println(zDate2.getSecond()); // 2
        System.out.println(zDate2.getOffset()); // +09:00
        System.out.println(zDate2.getZone()); // Asia/Seoul
    }
}
