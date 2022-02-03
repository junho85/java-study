import org.junit.jupiter.api.Test;

class NullPointerExceptionTest {
    @Test
    void test() {
        Boolean source = null;
        boolean destination = Boolean.TRUE.equals(source);
    }
}
