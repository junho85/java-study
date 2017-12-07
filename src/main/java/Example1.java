import java.io.Serializable;
import java.net.ConnectException;
import java.util.Random;


abstract class Animal {
    abstract void say();

}
public class Example1 {

    public static void main(String[] args) {
        if (1 == Integer.parseInt("1")) {
            System.out.println("haha");
        }

        class Chicken extends Animal {
            void say() {
                System.out.println("RhRldy");
            }
        }
        


        int a = 10;
        System.out.printf("haha %d\n", a);
        System.out.printf("haha %d\n", a);

//        throw new NumberFormatException("haha");
//        throw new StackOverflowError("haha");
//        throw new CloneNotSupportedException("haha");
//        throw new ClassCastException("haha");
//        throw new ConnectException("haha");

//        System.getProperties().list(System.out);

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
    }
}

class SimulThread extends Thread {
    SharedArea sharedArea;
    public void run() {
        int sum = 0;
        for (int cnt = 0 ; cnt < 1000000; cnt++) {
            Random random = new Random();
            boolean isHead = random.nextBoolean();
            if (isHead) sum++;
        }
        sharedArea.ratio = sum / 1000000.0;
        // TODO
    }
}

class SharedArea {
    Double ratio;
}

class ResultThread extends Thread {
    SharedArea sharedArea;
    public void run() {
        if (sharedArea.ratio == null) {
            // TODO
        }
        System.out.println(sharedArea.ratio);
    }
}