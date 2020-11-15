package enumtest;

public enum TestEnum {
    TEST1("url1-1", "url1-2"),
    TEST2("url2-1", "url2-2")
    ;

    static {
        System.out.println("initialize");
        for (TestEnum value : values()) {
            System.out.println(value);
        }
    }

    public final String url1;
    public final String url2;

    TestEnum(String url1, String url2) {
        this.url1 = url1;
        this.url2 = url2;
    }

}
