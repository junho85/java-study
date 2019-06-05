package pattern.composite1;

public class Keyboard extends ComputerDevice {
    private int price;
    private int power;

    public Keyboard(int power, int price) {
        this.power = power;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
