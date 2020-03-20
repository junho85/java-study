package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = Maps.newHashMap(); // Guava
        HashMap<String, Integer> map = new HashMap<>();
        map.put("june", 12);
        map.put("hello", 22);
        map.put("world", 33);

        System.out.println("=== keySet ===");
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("=== entrySet ===");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("=== iterator ===");
        Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("=== forEach ===");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        System.out.println("=== stream forEach ===");
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
