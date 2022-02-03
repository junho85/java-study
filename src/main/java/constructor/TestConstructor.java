package constructor;

import net.bytebuddy.implementation.bytecode.Throw;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestConstructor {
//    private static final Calendar gmtCal;
//    private static final Date BOOM_START;

//    static {
//        gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//        BOOM_START = gmtCal.getTime();
//    }

//    public Calendar getInstance() {
//        if (gmtCal == null) {
//            gmtCal = Calendar.getInstance();
//        }
//        return gmtCal;
//    }

    public TestConstructor() {

    }

    public void close() {
        // fp 돌려주는...

    }

    protected void finalize() {
        System.out.println("finalize");
    }

    public static void main(String[] args) {
        TestConstructor testConstructor = new TestConstructor();
//
        testConstructor.close();

        System.out.println("test....");

//        MyClass myClass = new MyClass();

//        System.out.println(Fruit.MANGO.getName());
//
//        Boolean.valueOf("true");
//
//        Calendar.getInstance(TimeZone.getTimeZone("GMT"));

//        Map<String, String> testMap = new HashMap<>();
//        testMap.put("1", "1");
//        testMap.put("2", "2");
//        testMap.put("3", "3");
//        testMap.put("4", "4");

//        ConcurrentHashMap

//        Set<String> strings1 = testMap.keySet();
//        Set<String> strings2 = testMap.keySet();
//        System.out.println(strings1 == strings2);
//        Set<String> strings2 = testMap.keySet();
//        Set<String> strings3 = testMap.keySet();

        System.out.println("test....2");
        Long sum = 0L;
        for (long i =0 ; i<Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("test....3");
        System.out.println(sum);
    }
}
