package string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTest {
    @Test
    public void join() {
        List<Integer> intList = Arrays.asList(1,2,3);

        // before java8
        List<String> strList = new ArrayList<>();
        for (Integer integer : intList) {
            strList.add(String.valueOf(integer));
        }
        final String join1 = String.join(",", strList);
        System.out.println(join1);

        // java8
        final String join2 = intList.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(join2);
    }
}
