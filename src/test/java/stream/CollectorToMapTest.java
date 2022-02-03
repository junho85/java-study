package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;
import static org.assertj.core.api.Assertions.assertThat;

class CollectorToMapTest {
    final List<String> sampleList = Arrays.asList("a", "b", "c", "d");

    @Test
    void test() {
        AtomicInteger index = new AtomicInteger();

        Map<String, Integer> map = sampleList.stream().collect(
                toMap(Function.identity(), str -> index.getAndIncrement())
        );

        assertThat(map)
                .containsEntry("a", 0)
                .containsEntry("b", 1)
                .containsEntry("c", 2)
                .containsEntry("d", 3)
        ;
        System.out.println(map); // {a=0, b=1, c=2, d=3}
    }
}
