package env;


import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class EnvTest {

    @Test
    public void test() {
        String property = System.getProperty("test.env");
        System.out.println(property); // null
//        System.out.println(property.equals("true")); // NullPointerException
//        assertThat(formatter.format(123456789)).isEqualTo("123,456,789");

        if (property != null && property.equals("test")) {
            System.out.println("test");
        }

        Optional<String> test = Optional.ofNullable(property)
                .filter(s -> s.equals("test"));

        String getenv = System.getenv("test.env");
        System.out.println(getenv); // null
    }

}
