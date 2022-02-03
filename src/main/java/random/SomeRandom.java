package random;

import java.util.Random;

public class SomeRandom {
    static void test() {
        Random random = new Random();
        System.out.println(random.nextInt());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            test();
        }
    }
}
