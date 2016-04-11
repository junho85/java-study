import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZoneTest {
    public static void main(String[] args) {
        System.out.println("UTC Timestamp=" + Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getTime());
        System.out.println("Local Timestamp=" + Timestamp.valueOf(LocalDateTime.now()).getTime());
        System.out.println("UTC Timestamp name=" + Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getNanos());

        System.out.println("GMT=" + LocalDateTime.now(ZoneId.of("GMT")));
        System.out.println("UTC=" + LocalDateTime.now(ZoneId.of("UTC")));

        System.out.println("Local DateTime=" + LocalDateTime.now());
        System.out.println("Local Date=" + LocalDateTime.now().toLocalDate());
        System.out.println("Local Time=" + LocalDateTime.now().toLocalTime());
    }
}
