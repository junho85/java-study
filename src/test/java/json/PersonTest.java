package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class PersonTest {
    @Test
    public void test() throws JsonProcessingException {
        Person person = Person.builder()
                .firstName("Michael")
                .lastName("Jordan")
                .byName("Air Jordan")
                .birthday(new Date())
                .createdAt(ZonedDateTime.parse("2020-08-21T14:13:57+09:00"))
                .build();

        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        System.out.println(mapper.writeValueAsString(person));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person));
    }
}