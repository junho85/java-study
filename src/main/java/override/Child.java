package override;

public class Child extends Parent {
    @Override
    public void test() {
        super.test();
        System.out.println("I'm Child");
    }

    @Override
    protected void testProtected() {
        super.testProtected();
        System.out.println("I'm Protected Child");
    }
}
