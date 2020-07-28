package number;

import org.junit.Test;

public class NumberTest {
    @Test
    public void test() {
        String oldMailId = "H000000000EglNe";
//        long newMailId = Long.parseLong(oldMailId, 62); // java.lang.NumberFormatException: radix 62 greater than Character.MAX_RADIX
//        System.out.println(newMailId);
        System.out.println(Character.MAX_RADIX); // 36
        System.out.println(Long.MAX_VALUE); // 9223372036854775807 (0x7fffffffffffffffL)
    }


}
