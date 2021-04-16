package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SnakeOrCamelCaseStrategyTestObjectTest {
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void test() throws JsonProcessingException {
        SnakeOrCamelCaseStrategyTestObject snakeOrCamelCaseStrategyTestObject = objectMapper.readValue("{\n" +
                "  \"account_id\": 123,\n" +
                "  \"allow_ads\": true\n" +
                "}", SnakeOrCamelCaseStrategyTestObject.class);
        System.out.println(snakeOrCamelCaseStrategyTestObject);
    }
}