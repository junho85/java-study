package override;

public class GrandChild extends Child {
    @Override
    public void test() {
        super.test();
        System.out.println("I'm Grand Child");
    }

    @Override
    protected void testProtected() {
        super.testProtected();
        System.out.println("I'm Protected Grand Child");
    }

    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.test();
        grandChild.testProtected();
    }

}
