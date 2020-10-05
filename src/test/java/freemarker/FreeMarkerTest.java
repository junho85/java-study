package freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import json.Person;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

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
}
