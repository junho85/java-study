package hashmap;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.BDDAssertions.then;

class HashMapTestExample {
    /**
     * java9 Map.of
     */
    @Test
    void test() {
        Map<String, Object> map = Map.of(
                "name", "junho85",
                "nickname", "June Kim"
        );
        System.out.println(map);
    }

    @Test
    void test10() {
        Map<String, Object> map = Stream.of(new Object[][] {
                { "name", "junho85" },
                { "nickname", "June Kim" },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> data[1]));
        System.out.println(map);
    }

    @Test
    void test11() {
        Map<String, Object> map = Map.of(
                "name", "junho85",
                "nickname", "June Kim",
                "a", "June Kim",
                "b", "June Kim",
                "c", "June Kim",
                "d", "June Kim",
                "e", "June Kim",
                "f", "June Kim",
                "g", "June Kim",
//                "h", "June Kim",
//                "i", "June Kim",
                "j", "June Kim" // 10개 까지 가능
        );
        System.out.println(map);
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
                new AbstractMap.SimpleEntry<>("nickname", "June Kim"),
                new AbstractMap.SimpleEntry<>("a", "June Kim"),
                new AbstractMap.SimpleEntry<>("b", "June Kim"),
                new AbstractMap.SimpleEntry<>("c", "June Kim"),
                new AbstractMap.SimpleEntry<>("d", "June Kim"),
                new AbstractMap.SimpleEntry<>("e", "June Kim"),
                new AbstractMap.SimpleEntry<>("f", "June Kim"),
                new AbstractMap.SimpleEntry<>("g", "June Kim"),
                new AbstractMap.SimpleEntry<>("h", "June Kim"),
                new AbstractMap.SimpleEntry<>("i", "June Kim"),
                new AbstractMap.SimpleEntry<>("j", "June Kim")
        );
        System.out.println(test);
    }
    @Test
    void test22() {
        Map<String, Object> test = Map.ofEntries(
                Map.entry("name", "Kim"),
                Map.entry("nickname", "June Kim"),
                Map.entry("a", "June Kim"),
                Map.entry("b", "June Kim"),
                Map.entry("c", "June Kim"),
                Map.entry("d", "June Kim"),
                Map.entry("e", "June Kim"),
                Map.entry("f", "June Kim"),
                Map.entry("g", "June Kim"),
                Map.entry("h", "June Kim"),
                Map.entry("i", "June Kim"),
                Map.entry("j", "June Kim")
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

    @Test
    void test5_2() {
        Map<String, Object> map = new HashMap<>() {{
            put("name", "junho85");
            put("nickname", "June Kim");
        }};
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

    @Test
    void test_empty1() {
        Map<String, Object> map = Map.of();
        System.out.println(map);
    }

    @Test
    void test_empty2() {
        Map<String, Object> map = new HashMap<>();
        System.out.println(map);
    }

    @Test
    void test_empty3() {
        Map<String, Object> map = Collections.emptyMap();
//        map.put("name", "junho85"); // UnsupportedOperationException
        System.out.println(map);
    }

}