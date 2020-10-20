//package array;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class ConvertCollectionToArrayTest {
//    private Collection<String> getTestCollection() {
//        Collection<String> stringCollection = new ArrayList();
//        stringCollection.add("1");
//        stringCollection.add("2");
//        stringCollection.add("3");
//
//        return stringCollection;
//    }
//    @Test
//    public void test_collection_to_array() {
//        Collection<String> stringCollection = getTestCollection();
//
//        for (String s : stringCollection) {
//            System.out.println(s);
//        }
//
//        // convert
//        String[] stringArray = stringCollection.toArray(new String[stringCollection.size()]);
//        for (String s : stringArray) {
//            System.out.println(s);
//        }
//    }
//
//    @Test
//    public void test_collection_to_array_shorter() {
//        Collection<String> stringCollection = getTestCollection();
//
//        for (String s : stringCollection) {
//            System.out.println(s);
//        }
//
//        // convert
//        String[] stringArray = stringCollection.toArray(new String[0]);
//
//        for (String s : stringArray) {
//            System.out.println(s);
//        }
//
//    }
//
//    @Test
//    public void test_collection_to_array_stream() {
//        Collection<String> stringCollection = getTestCollection();
//
//        for (String s : stringCollection) {
//            System.out.println(s);
//        }
//
//        // convert
//        String[] stringArray = stringCollection.stream()
//                .map(x -> new String(x))
//                .toArray(size -> new String[size]);
//
//        for (String s : stringArray) {
//            System.out.println(s);
//        }
//
//    }
//
//    @Test
//    public void test_collection_to_array_stream_shorter() {
//        Collection<String> stringCollection = getTestCollection();
//
//        for (String s : stringCollection) {
//            System.out.println(s);
//        }
//
//        // convert
//        String[] stringArray = stringCollection.stream()
//                .toArray(String[]::new);
//
//        for (String s : stringArray) {
//            System.out.println(s);
//        }
//
//    }
//
//}
