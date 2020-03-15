package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = Maps.newHashMap(); // Guava
        HashMap<String, Integer> map = new HashMap<>();
        map.put("june", 12);
        map.put("hello", 22);
        map.put("world", 33);

        for (Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
