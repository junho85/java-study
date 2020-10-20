package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

public class TestJsonObjectTest {
    @Test
    public void test() throws JsonProcessingException {
        TestJsonObject testJsonObject = TestJsonObject.builder()
                .userName("테스트 이름")
                .age(5)
                .hobby("테스트 취미")
                .testDateTime(ZonedDateTime.now())
                .build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testJsonObject);
        System.out.println(s);

    }
}