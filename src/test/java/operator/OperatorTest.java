package operator;

import org.junit.jupiter.api.Test;

public class OperatorTest {
    @Test
    void test() {
        System.out.println(2^0); // 10 xor 00 = 10 = 2
        System.out.println(2^1); // 10 xor 01 = 11 = 3
        System.out.println(2^2); // 10 xor 10 = 00 = 0
        System.out.println(2^3); // 10 xor 11 = 01 = 1
        System.out.println(2^4); // 10 xor 100 = 110 = 6
        
    }
}
