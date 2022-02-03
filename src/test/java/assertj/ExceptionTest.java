package assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ExceptionTest {
    @Test
    void test() {
        assertThatCode(() -> {
            System.out.println("hello world");
//            throw new RuntimeException();
        }).doesNotThrowAnyException();

        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            throw new RuntimeException();
        });
    }
}
