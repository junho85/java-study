public class MyTest {

    private static Integer a = 0;
    public static void main(String[] args) {
//        System.out.println(test());
//        System.out.println("hello");

        int sum = 0;
        for (String item : args) {
            sum += Integer.parseInt(item);
        }
        System.out.println(sum);

//        args = { "1", "2", "3", "4", "5" }
//        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
//
//        int sum = 0;
//        for (int i=0; i<=4; i++) {
//            sum += arr[i+2];
//        }
//        int i = 0;
//        System.out.println(sum);
//        sum = 0;
//        for (int i=2; i<=6; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        int arr[] = { 10, 20, 30, 40, 50 };


    }

    private static Integer test() {
        a = 3;
        try {
            return a;
        } finally{
            a = 5;
            haha();
            return 1;
        }
    }

    private static void haha() {
        System.out.println("hoho");
        a = 10;
    }
}
