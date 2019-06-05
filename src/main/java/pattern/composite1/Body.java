package pattern.composite1;

public class Body extends ComputerDevice {
    private int price;
    private int power;

    public Body(int power, int price) {
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
