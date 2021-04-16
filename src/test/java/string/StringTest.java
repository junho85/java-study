package string;

import org.junit.jupiter.api.Test;

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
        // pool of strings
        System.out.println("== pool of strings ==");
        String a = "aaa";
        String b = "aaa";
        System.out.println(a == b); // true
        System.out.println(a.intern() == b.intern()); // true

        // new object
        // heap 영역에 새 객체를 생성합니다.
        System.out.println("== new object ==");
        String aa = new String("aaa");
        String bb = new String("aaa");
        System.out.println(aa == bb); // false
        System.out.println(aa.intern() == bb.intern()); // true
        System.out.println(aa == bb); // false
        System.out.println(aa.equals(bb)); // true

        // poll of strings and object
        System.out.println("== pool of strings and object ==");
        System.out.println(a == aa); // false
        System.out.println(a == aa.intern()); // true

        // optimization
        System.out.println("== optimization ==");
        System.out.println("aaa" == "aa" + "a"); // true
    }

    @Test
    public void test4() {
        String a = "hello ";
        a = a + "world";
        a = a + "nice ";
        a = a + "to ";
        a = a + "meet ";
        for (int i=0 ;i<5; i++) {
            a = a + "you";
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
    }
}
