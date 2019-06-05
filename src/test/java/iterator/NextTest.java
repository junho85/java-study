package iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class NextTest {
    /**
     * next 가 없는데 next() 호출해서 예외 발생시킴
     */
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

    /**
     * catch NoSuchElementException 을 잡아 봄
     */
    @Test
    public void test2() {
        String[] array = {};
        List<String> strings = Arrays.asList(array);

        System.out.println("test");
        Iterator<String> iterator = strings.iterator();
        System.out.println("test2");
        try {
            // java.util.NoSuchElementException - RuntimeException
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage()); // null
            System.out.println(e.getCause()); // null
        }
        System.out.println("test3"); // not executed

    }
}
