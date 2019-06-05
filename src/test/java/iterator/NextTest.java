package iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NextTest {
    @Test
    public void test() {
        String[] array = {};
        List<String> strings = Arrays.asList(array);

        System.out.println("test");
        Iterator<String> iterator = strings.iterator();
        System.out.println("test2");
        System.out.println(iterator.next());
        // java.util.NoSuchElementException - RuntimeException
        System.out.println("test3"); // not executed
    }
}
