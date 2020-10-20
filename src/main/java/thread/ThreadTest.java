package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    int a = 0;
    int b = 0;
    int x = 0;
    int y = 0;

    public int[] reodering() throws BrokenBarrierException, InterruptedException {
        final CyclicBarrier gate = new CyclicBarrier(3);

        Thread one = new Thread(() -> {
            try {
                gate.await();
                a = 1;
                x = b;
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread other = new Thread(() -> {
            try {
                gate.await();
                b = 1;
                y = a;
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        one.start();
        other.start();

        gate.await();

        one.join();
        other.join();

        return new int[] {x, y};
    }

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        for (int i=0; i<10000; i++) {
            ThreadTest test = new ThreadTest();

            int[] reodering = test.reodering();
            System.out.println(reodering[0] + "," + reodering[1]);
        }
    }
}
