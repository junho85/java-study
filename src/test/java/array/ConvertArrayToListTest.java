package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToListTest {
    @Test
    public void test1() {
        String[] array = {"1", "2", "3", "4"};
        List<String> strings = Arrays.asList(array);
//        strings.add("5"); // fail. immutable

        System.out.println(strings);
    }

    @Test
    public void test2() {
        String[] array = {"1", "2", "3", "4"};
        List<String> strings = new ArrayList<>(Arrays.asList(array));
        strings.add("5");

        System.out.println(strings);
    }

    @Test
    public void test3() {
        String[] array = {"1", "2", "3", "4"};
        List<String> strings = new ArrayList<>();

        Collections.addAll(strings, array);
        strings.add("5");

        System.out.println(strings);
    }

    @Test
    public void test4() {
        List<String> strings = new ArrayList<String>() {{
            add("1");
        }};

        String[] array = {"2", "3", "4"};

        Collections.addAll(strings, array);

        System.out.println(strings);
    }

    @Test
    public void test5() {
        String[] array = {"1", "2", "3", "4"};
        List<String> strings = Arrays.stream(array).collect(Collectors.toList());
        strings.add("5");

        System.out.println(strings);
    }
}
