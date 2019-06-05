package iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class NextTest {
    Iterator<String> getEmptyIterator() {
        String[] array = {};
        List<String> strings = Arrays.asList(array);

        return strings.iterator();
    }

    Iterator<String> getNotEmptyIterator() {
        String[] array = {"1","2","3"};
        List<String> strings = Arrays.asList(array);

        return strings.iterator();
    }

    /**
     * next 가 없는데 next() 호출해서 예외 발생시킴
     */
    @Test
    public void test_nosuchelementexception() {
        Iterator<String> emptyIterator = getEmptyIterator();

        System.out.println(emptyIterator.next());
        // java.util.NoSuchElementException - RuntimeException

        System.out.println("should not not executed"); // not executed
    }

    /**
     * catch NoSuchElementException 을 잡아 봄
     */
    @Test
    public void test_try_catch() {
        Iterator<String> emptyIterator = getEmptyIterator();
        try {
            // java.util.NoSuchElementException - RuntimeException
            System.out.println(emptyIterator.next());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage()); // null
            System.out.println(e.getCause()); // null
        }
        System.out.println("executed");
    }

    @Test
    public void test_safe() {
        Iterator<String> emptyIterator = getEmptyIterator();
        while (emptyIterator.hasNext()) {
            String str = emptyIterator.next();
            System.out.println(str);
        }

        // 1,2,3
        Iterator<String> notEmptyIterator = getNotEmptyIterator();
        while (notEmptyIterator.hasNext()) {
            String str = notEmptyIterator.next();
            System.out.println(str);
        }

    }
}
