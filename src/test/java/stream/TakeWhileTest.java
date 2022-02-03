package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TakeWhileTest {
    @Test
    void test() {
        String[] a = {"a", "b", "c", "d", "e"};

        List<String> abc = Arrays.stream(a).takeWhile(str -> !str.equals("d")).collect(Collectors.toList());
        System.out.println(abc); // [a, b, c]

    }
}
