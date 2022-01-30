package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

class CollectorTest {
    final List<String> sampleList = Arrays.asList("a", "b", "c", "d", "a");

    @Test
    void test_duplicate_error() {
        AtomicInteger index = new AtomicInteger();

        assertThatIllegalStateException().isThrownBy(() -> {
            Map<String, Integer> map = sampleList.stream().collect(
                    toMap(Function.identity(), str -> index.getAndIncrement())
            );
        });
    }

    @Test
    void test_keep_old_value_when_duplicate() {
        AtomicInteger index = new AtomicInteger();

        Map<String, Integer> map = sampleList.stream().collect(
                toMap(Function.identity(), str -> index.getAndIncrement(),
                        (oldValue, newValue) -> oldValue) // key가 중복 되는 경우 기존 값 유지. a=0
        );

        assertThat(map)
                .containsEntry("a", 0) // 기존 값 유지
                .containsEntry("b", 1)
                .containsEntry("c", 2)
                .containsEntry("d", 3)
        ;
        System.out.println(map); // {a=0, b=1, c=2, d=3}
    }

    @Test
    void test_replace_to_new_value_when_duplicate() {
        AtomicInteger index = new AtomicInteger();

        Map<String, Integer> map = sampleList.stream().collect(
                toMap(Function.identity(), str -> index.getAndIncrement(),
                        (oldValue, newValue) -> newValue) // key가 중복 되는 경우 새 값으로 변경. a=4
        );

        assertThat(map)
                .containsEntry("a", 4) // 새 값으로 변경
                .containsEntry("b", 1)
                .containsEntry("c", 2)
                .containsEntry("d", 3)
        ;
        System.out.println(map); // {a=4, b=1, c=2, d=3}
    }
}
