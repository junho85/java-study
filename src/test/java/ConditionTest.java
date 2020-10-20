import org.junit.jupiter.api.Test;

public class ConditionTest {
    @Test
    public void test() {
        System.out.println("hello");

//        String type = "M"; // fail
        String type = "K"; // fail
//        String type = "C"; // success

        if (!(type.equals("K") || type.equals("M"))) {
            System.out.println("success...");
        } else {
            System.out.println("fail...");
        }
    }
}
