package string;

import org.junit.Test;

public class StringTest {
    @Test
    public void test() {
        System.out.println("hello world " + null + " is null");
    }

    @Test
    public void test2() {
        String str = "hello\nworld\nnice\nto\nmeet\nyou";

        System.out.println(str);
        System.out.println(str.replaceAll("\\n", "\\\\n"));
    }
}
