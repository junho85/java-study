package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class TestJsonObjectTest {
    @Test
    public void test() throws JsonProcessingException {
        TestJsonObject testJsonObject = TestJsonObject.builder()
                .userName("테스트 이름")
                .age(5)
                .hobby("테스트 취미")
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(testJsonObject);
        System.out.println(s);

    }
}