package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConvertCollectionToListTest {
    @Test
    public void test() {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");

        List<String> list = new ArrayList<>(collection);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
