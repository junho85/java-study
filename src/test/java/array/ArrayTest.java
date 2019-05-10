package array;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.*;

public class ArrayTest {

    @Test
    public void test1() {
        String[] array = {"1", "2", "3", "4"};
        List<String> strings = Arrays.asList(array);

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (iterator.hasNext()) {
                System.out.println("there is next value");
            } else {
                System.out.println("there isn't next value");
            }
        }
    }

    @Test
    public void test2() {
        String[] array = new String[]{"1", "2", "3", "4"};
        List<String> strings = Arrays.asList(array);

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (iterator.hasNext()) {
                System.out.println("there is next value");
            } else {
                System.out.println("there isn't next value");
            }
        }
    }

    @Test
    public void test3() {
        List<String> strings = Arrays.asList("1", "2", "3", "4");

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (iterator.hasNext()) {
                System.out.println("there is next value");
            } else {
                System.out.println("there isn't next value");
            }
        }
    }

    @Test
    public void test4() {
        String[] array = ArrayUtils.toArray("1", "2", "3", "4");

        for (String s : array) {
            System.out.println(s);
        }
    }
}
