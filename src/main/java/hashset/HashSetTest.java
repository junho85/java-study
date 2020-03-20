package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
//        Set<String> sets = Sets.newHashSet(); // Guava
        Set<String> sets = new HashSet<>();

        sets.add(null);
        sets.add(null);
        sets.add("hello");
        sets.add("hello");
        sets.add("hello2");

        for (String set : sets) {
            System.out.println(set);
        }
    }
}
