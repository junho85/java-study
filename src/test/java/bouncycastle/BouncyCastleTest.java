package bouncycastle;

import org.bouncycastle.util.encoders.Base64;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

class BouncyCastleTest {
    @Test
    void test() {
        String user = "{\"id\": 1111, \"accountId\": 12345, \"nickname\": \"홍길동\", \"countryIso\": \"KR\", \"countryCode\": \"82\"}";
        String device = "{\"id\": 2222,\"agent\":\"ios\",\"version\":\"1.3.0\",\"role\":\"main\"}";

        String encodedUser = Base64.toBase64String(user.getBytes(Charset.defaultCharset()));
        String encodedDevice = Base64.toBase64String(device.getBytes(Charset.defaultCharset()));

        System.out.println(encodedUser);
        System.out.println(encodedDevice);
    }

    @Test
    void test2() {
        final String talkUser = "{\"id\": 1111, \"accountId\": 12345, \"nickname\": \"홍길동\", \"countryIso\": \"KR\", \"countryCode\": \"82\"}";
        final String talkDevice = "{\"id\": 2222,\"agent\":\"ios\",\"version\":\"1.3.0\",\"role\":\"main\"}";

        // BouncyCastle
        final String encodedUser = Base64.toBase64String(talkUser.getBytes(Charset.defaultCharset()));
        final String encodedDevice = Base64.toBase64String(talkDevice.getBytes(Charset.defaultCharset()));

        // java.util
        final String encodedUser2 = java.util.Base64.getEncoder().encodeToString(talkUser.getBytes());
        final String encodedDevice2 = java.util.Base64.getEncoder().encodeToString(talkDevice.getBytes());

        assertThat(encodedUser)
                .isEqualTo(encodedUser2);
        assertThat(encodedDevice)
                .isEqualTo(encodedDevice2);

        System.out.println(encodedUser);
        System.out.println(encodedDevice);
    }
}
