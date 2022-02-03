package string;

import json.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StringTest {
    @DisplayName("null to string test")
    @Test
    void test_null_to_string() {
        assertThat("hello world " + null + " is null")
                .isEqualTo("hello world null is null");
    }

    @Test
    void test() {
        int aa = 1;
        int bb = 1;

        System.out.println(aa == bb); // true

        Integer aaa = Integer.valueOf(1);
        Integer bbb = Integer.valueOf(1);

        System.out.println(aaa == bbb); // true

        String a = new String("hello world");
        String b = new String("hello world");

        System.out.println("hello world" == "hello world"); // true
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
    }

    @Test
    void test2() {
        String str = "hello\nworld\nnice\nto\nmeet\nyou";

        System.out.println(str);
        System.out.println(str.replaceAll("\\n", "\\\\n"));
    }

    @Test
    void removeSpacesTest() {
        String str = "a b c d";
        System.out.println(str); // a b c d
        System.out.println(str.replace(" ", "")); // abcd
        System.out.println(str.replaceAll("\\s", "")); // abcd
        System.out.println(str.replaceAll("\\s+", "")); // abcd
        System.out.println(str.replaceAll(" ", "")); // abcd
    }

    @Test
    void test3() {
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
    void test4() {
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

    @Test
    void test5() {
        MyTest myTest = new MyTest();
        myTest.name = "홍길동";
        myTest.nickname = "홍사부";
        System.out.println("Hello" + " world " + myTest);
    }

    @Test
    void assign_multiple_test() {
        String one, two, three;
        one = two = three = "123";
        String four = "123";

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(three.hashCode());
        System.out.println(four.hashCode());
        System.out.println(one); // 123
        System.out.println(two); // 123
        System.out.println(three); // 123

        three = "333";

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(three.hashCode());
        System.out.println(one); // 123
        System.out.println(two); // 123
        System.out.println(three); // 333
    }

    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
    }


}
