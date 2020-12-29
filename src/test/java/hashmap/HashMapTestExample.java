package hashmap;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.BDDAssertions.then;

class HashMapTestExample {
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

    @Test
    void test3() {
        // Given

        // When
        final Throwable throwable = catchThrowable(() -> Map.of(
                "name", null
        ));

        // Then
        then(throwable)
                .as("NullPointerException should be thrown")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void test4() {
        Map<String, String> test = new HashMap<>() {{
            put("name", null);
        }};
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

    @Test
    void test5() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "junho85");
        map.put("nickname", "June Kim");
        System.out.println(map);
    }

    /**
     * Map.of()로 만들면 Immutable이라 put불가
     */
    @Test
    void test6() {
        // Given
        Map<String, Object> map = Map.of();

        // When
        final Throwable throwable = catchThrowable(() -> map.put("name", "junho85"));

        // Then
        then(throwable)
                .as("UnsupportedOperationException should be thrown")
                .isInstanceOf(UnsupportedOperationException.class);
    }

}