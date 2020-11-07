package hashmap;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTestTest {
    
    /**
     * java9 Map.of
     */
    @Test
    void test() {
        Map<String, Object> test = Map.of(
                "name", "Kim",
                "age", 36
        );
        System.out.println(test);
    }

    /**
     * java9 Map.ofEntries
     */
    @Test
    void test2() {
        Map<String, Object> test = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("name", "Kim"),
                new AbstractMap.SimpleEntry<>("age", 36)
        );
        System.out.println(test);
    }

}