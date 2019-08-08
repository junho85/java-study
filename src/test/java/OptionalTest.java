import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest {
    @Test
    public void test() {
        Map<Integer, String> cities = new HashMap<>();
        cities.put(1, "Seoul");
        cities.put(2, "Busan");
        cities.put(3, "Daejeon");

        System.out.println(cities.get(4));


    }

    @Test
    public void test_empty() {
        Optional<String> strEmpty = Optional.empty();
//        strEmpty = Optional.of("hello");
        System.out.println(strEmpty.orElse("world"));
        System.out.println(strEmpty.get()); // NoSuchElementException
    }

    @Test
    public void test_empty2() {
        Optional<String> strEmpty = Optional.empty();
        if (!strEmpty.isPresent()) {
            System.out.println("empty default");
        }
    }

    @Test
    public void test_empty3() {
        Optional<String> strEmpty = Optional.empty();
        System.out.println(Optional.ofNullable(strEmpty)
                .orElse(Optional.of("empty default")));
    }

    @Test
    public void test_nullable() {
        String nullString = null;
        boolean result = Optional.ofNullable(nullString)
                .filter(s -> s.equals("test"))
                .isPresent();

        System.out.println(result);


        String isAdmin = "true";
        if (Optional.ofNullable(isAdmin).filter(s -> s.equals("true")).isPresent()) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}