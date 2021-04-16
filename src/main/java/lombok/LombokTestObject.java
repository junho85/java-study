package lombok;

@Data
@Builder
public class LombokTestObject {
    private String name;
    private String text;

    public static class LombokTestObjectBuilder {
        private String text;

        public LombokTestObjectBuilder text(String text) {
            this.text = text + " world";
            return this;
        }
    }
}
