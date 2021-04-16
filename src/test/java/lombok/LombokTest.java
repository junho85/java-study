package lombok;

import org.junit.jupiter.api.Test;

public class LombokTest {
    @Test
    public void test() {
        LombokTestObject lombokTestObject = LombokTestObject.builder()
                .name("junho85")
                .text("hello") // text + "world"
                .build();
        System.out.println(lombokTestObject);
    }
}
