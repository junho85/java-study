package etc;

import org.junit.Test;

public class GetCurrentMethodNameTest {
    @Test
    public void test_thread() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void test_throwable() {
        System.out.println(new Throwable().getStackTrace()[0].getMethodName());
    }
}
