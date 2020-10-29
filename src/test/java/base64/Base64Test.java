package base64;

import org.junit.jupiter.api.Test;

import java.util.Base64;

public class Base64Test {
    @Test
    void encode() {
        String test = "안녕하세요";
        String s = Base64.getEncoder().encodeToString(test.getBytes());
        System.out.println(s);
    }

    @Test
    void decode() {
        String s = new String(Base64.getDecoder().decode("7JWI64WV7ZWY7IS47JqU"));
        System.out.println(s);
    }
}
