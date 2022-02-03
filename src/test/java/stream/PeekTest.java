package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PeekTest {
    @Test
    void test10() {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream.forEach(System.out::println);
    }

    @Test
    void test11() {
        // https://www.baeldung.com/java-streams-peek-api
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream.peek(System.out::println)
                .collect(Collectors.toList());
//        System.out.println("=== end test");
    }

    @Test
    void test12() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    @Test
    void test3() {
        // [자바 스트림 Java Stream => 루핑 (peek(), forEach()) / 매칭( allMatch(), anyMatch(), noneMatch() )]
        // https://altongmon.tistory.com/263
        int[] intArr = {24, 48, 60, 80, 100};

        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a % 2 == 0);

        System.out.println("모두 2의 배수입니까? " + result);

        result = Arrays.stream(intArr)
                .anyMatch(a -> a % 3 == 0);

        System.out.println("하나라도 3의 배수가 있습니까? " + result);


        result = Arrays.stream(intArr)
                .noneMatch(a -> a % 3 == 0);

        System.out.println("3의 배수가 없습니까?  " + result);

    }
}
