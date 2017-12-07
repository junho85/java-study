public class Closures {
    public static void main(String[] args) {
        int answer = 42;

        String name = "hello";
        Thread t = new Thread(() -> System.out.println("The answer is: " + answer + "; name: " + name));
        t.run();

//        answer = 52;

        System.out.println("The answer is: " + answer + "; name: " + name);

    }

}
