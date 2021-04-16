package interview;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StringNullTest {
    @Test
    void test() {
        String cmd = null;

        if (cmd.equals("test")) { // NullPointerException
            System.out.println("couldn't be reached");
        }
    }

    @Test
    void test2() {
        String cmd = null;

        if ("test".equals(cmd)) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }

//    @Test
//    void test3() {
//        String cmd = null;
////        String cmd = "test";
//
//        if (Optional.ofNullable(cmd).map(a -> cmd.equals(a))) {
//            System.out.println("1");
//        } else {
//            System.out.println("2");
//        }
//    }
}
