package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void test() throws JsonProcessingException {
        Person person = Person.builder()
                .firstName("Michael")
                .lastName("Jordan")
                .byName("Air Jordan")
                .build();

        ObjectMapper mapper = new ObjectMapper();
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        System.out.println(mapper.writeValueAsString(person));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person));
    }
}