package stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class DistinctTest {
    @Test
    public void test_set() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        HashSet<String> set = new HashSet<>();
        for (String name : list) {
            set.add(name);
        }
        for (String name : set) {
            System.out.println(name);
        }
    }

    @Test
    public void test_set1() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        HashSet<String> set = new HashSet<>();
        set.addAll(list);
        for (String name : set) {
            System.out.println(name);
        }
    }

    @Test
    public void test_set2() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        HashSet<String> set = new HashSet<>(list);
        for (String name : set) {
            System.out.println(name);
        }
    }

    @Test
    public void test_set3() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        HashSet<String> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    @Test
    public void test_set4() {
        List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥");
        new HashSet<>(list).forEach(System.out::println);
    }

    @Test
    public void test_distinct() {
        Arrays.asList("홍길동", "김삿갓", "홍길동", "김개똥").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test_distinct2() {
        Stream.of("홍길동", "김삿갓", "홍길동", "김개똥")
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test_reactor() {
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
