package array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void test() {
        List<String> strings = Arrays.asList("1", "2", "3");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
