import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class OptionalTest {
    @Test
    public void test() {
        Map<Integer, String> cities = new HashMap<>();
        cities.put(1, "Seoul");
        cities.put(2, "Busan");
        cities.put(3, "Daejeon");

        System.out.println(cities.get(4));


    }
}