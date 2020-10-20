package freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import json.Person;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerTest {

    @Test
    public void test() throws IOException, TemplateException {
        Person person = Person.builder()
                .firstName("길동")
                .build();

        Template template = new Template("redundant", new StringReader("${firstName}"),
                new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS));

        StringWriter out = new StringWriter();
        template.process(person, out);

        String result = out.toString();
        System.out.println(result);
        out.close();
    }

    @Test
    public void test2() throws IOException, TemplateException {
        List<Person> people = Arrays.asList(
                Person.builder().firstName("길동").build(),
                Person.builder().firstName("꺽정").build()
                );

        Map<String, Object> model = new HashMap<>();
        model.put("people", people);

        Template template = new Template("redundant", new StringReader("<#list people as person>\n" +
                "  <p>${person.firstName}\n" +
                "</#list>"),
                new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS));

        StringWriter out = new StringWriter();
        template.process(model, out);

        String result = out.toString();
        System.out.println(result);
        out.close();

    }
}
