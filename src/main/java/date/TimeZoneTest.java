package date;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {
    public static void main(String[] args) {
        System.out.println("UTC Timestamp=" + Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getTime());
        System.out.println("Local Timestamp=" + Timestamp.valueOf(LocalDateTime.now()).getTime());
        System.out.println("UTC Timestamp name=" + Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getNanos());

        System.out.println("currentTimeMillis=" + System.currentTimeMillis());
        System.out.println("currentTimeMillis/1000=" + System.currentTimeMillis() / 1000);

        Calendar c = Calendar.getInstance();
        System.out.println("c.getTimeInMillis=" + c.getTimeInMillis() / 1000);

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("UTC")));
        System.out.println("c2.getTimeInMillis=" + c2.getTimeInMillis() / 1000);


        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("hoho=" + utc.toEpochSecond());

        System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")).toEpochSecond(ZoneOffset.ofHours(0)));
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")).toEpochSecond(ZoneOffset.UTC));
        System.out.println("GMT=" + LocalDateTime.now(ZoneId.of("GMT")));
        System.out.println("UTC=" + LocalDateTime.now(ZoneId.of("UTC")));

        System.out.println("Local DateTime=" + LocalDateTime.now());
        System.out.println("Local Date=" + LocalDateTime.now().toLocalDate());
        System.out.println("Local Time=" + LocalDateTime.now().toLocalTime());
    }
}
