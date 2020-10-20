import org.junit.jupiter.api.Test;

public class FinalClassTest {
    public class MyClass {
        int width;


    }

    @Test
    public void test() {
        final MyClass test = new MyClass();
        test.width = 100;

        System.out.println(test.width);
    }
}
