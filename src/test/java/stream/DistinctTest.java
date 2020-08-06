package stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class DistinctTest {
    @Test
    public void test1() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        new HashSet<>(list).forEach(System.out::println);
    }

    @Test
    public void test2() {
        Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test3() {
        Stream.of("홍길동", "김삿갓", "홍길동", "김개똥")
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        Flux.just("홍길동", "김삿갓", "홍길동", "김개똥")
                .distinct()
                .doOnNext(System.out::println)
                .subscribe();
    }

    @Test
    public void test6() {
        // Guava
        Sets.newHashSet(Lists.newArrayList("홍길동", "김삿갓", "홍길동", "김개똥"))
                .forEach(System.out::println);

        /*
김삿갓
홍길동
김개똥
         */

    }
}
