package pattern.composite1;

/**
 * https://gmlwjd9405.github.io/2018/08/10/composite-pattern.html 예제 실습
 */
public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(5, 2);
        Body body = new Body(100, 70);
        Monitor monitor = new Monitor(20, 30);
        Mouse mouse = new Mouse(5, 30);

        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);
        computer.addComponent(mouse);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();

        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}
