import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZoneTest {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now(ZoneId.of("GMT")));
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
        System.out.println(Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getTime());
        System.out.println(Timestamp.valueOf(LocalDateTime.now()).getTime());
        System.out.println(Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))).getNanos());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().toLocalTime());
    }
}
