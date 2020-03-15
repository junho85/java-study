package string;

import java.util.ArrayList;
import java.util.List;

public class StringComparison {
    public static void main(String[] args) throws InterruptedException {
        String a = "aaa";
        String b = "aaa";

        int counter = 0;
        new Thread(() -> System.out.println(counter));

        ArrayList list = new ArrayList();
//        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1);
        list.add(true);

        System.out.println(list.toString());
    }
}
