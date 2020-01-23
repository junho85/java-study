package queue;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueTest {
    @Test
    public void test() {
        Queue<String> queue = new ConcurrentLinkedQueue<>();

        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        for (String s : queue) {
            System.out.println(s);
        }

    }

    @Test
    public void test2() {
        String[] array = new String[4];

        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        array[3] = "4";

        Queue<String> queue = new ConcurrentLinkedQueue<>(Arrays.asList(array));

        for (String s : queue) {
            System.out.println(s);
        }
    }

    @Test
    public void test3() {
        String[] array = {"1", "2", "3", "4"};

        Queue<String> queue = new LinkedList<>(Arrays.asList(array));

        for (String s : queue) {
            System.out.println(s);
        }

    }

}
