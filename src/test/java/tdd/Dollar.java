package tdd;

public class Dollar {
    public int amount;

    public Dollar(int i) {
        amount = i;
    }

    public void times(int i) {
        amount = amount * i;
    }
}
