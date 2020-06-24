package string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SplitTest {
    @Test
    public void test() {
        final String ids = "1,2,3,4,5";
        List<String> strings = Arrays.asList(ids.split(","));

        List<Long> collect = strings.stream()
                .map(Long::parseLong).collect(Collectors.toList());

        System.out.println(collect);

//        strings.stream().mapToLong(Long::parseLong).forEach(System.out::println);
//        Stream.of(strings)
//                .forEach(item -> System.out.println(item);
//                .map(item -> Long.parseLong(item))
//                .toArray();


    }
}
