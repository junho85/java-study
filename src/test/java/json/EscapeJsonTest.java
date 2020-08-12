package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EscapeJsonTest {
    @Test
    public void test() throws JsonProcessingException {
        Map<String, Object> message = new HashMap<>();
        message.put("name", "june.kim");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(message);
        System.out.println(s); // {"name":"june.kim"}

        JsonStringEncoder e = JsonStringEncoder.getInstance();
        System.out.println(e.quoteAsString(s)); // {\"name\":\"june.kim\"}

        Map<String, Object> message2 = new HashMap<>();
        message2.put("name", "june.kim");

        String s1 = new ObjectMapper().writeValueAsString(message);
        System.out.println(s1);


        JsonStringEncoder instance = JsonStringEncoder.getInstance();
        String s2 = String.valueOf(instance.quoteAsString(s1));
        System.out.println(s2);

        Person person = Person.builder().build();
        person.setExtra(s2);

        System.out.println(person);
    }

    @Test
    public void testEscape() throws JsonProcessingException {
        Map<String, Object> message = new HashMap<>();
        message.put("type", "BIG");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(message);

        System.out.println(s); // {"type":"BIG"}

        JsonStringEncoder encoder = JsonStringEncoder.getInstance();
        char[] escapedJson = encoder.quoteAsString(s);
        System.out.println(escapedJson); // {\"type\":\"BIG\"}

        // char[] to String
        System.out.println(String.valueOf(escapedJson)); // {\"type\":\"BIG\"}
        System.out.println(new String(escapedJson)); // {\"type\":\"BIG\"}
    }


}
