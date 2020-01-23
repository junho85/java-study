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

    @Test
    public void test3() {
        System.out.println("aaa" == "aa" + "a"); // true

        String a = "aaa";
        String b = "aaa";
        System.out.println(a == b); // true

        String aa = new String("aaa");
        String bb = new String("aaa");
        System.out.println(aa == bb); // false
    }

    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
    }
}
