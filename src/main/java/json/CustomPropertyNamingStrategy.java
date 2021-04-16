package json;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class CustomPropertyNamingStrategy extends PropertyNamingStrategy {
    public static final PropertyNamingStrategy SNAKE_OR_CAMEL_CASE = new SnakeOrCamelCaseStrategy();

    public static class SnakeOrCamelCaseStrategy extends PropertyNamingStrategyBase {
        @Override
        public String translate(String input) {
            SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();
            try {
                return snakeCaseStrategy.translate(input);
            } catch (Exception e) {
                // LowerCamelCase Strategy
                return translate(input);
            }
        }
    }
}
