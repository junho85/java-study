package array;

import json.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void test() {
        List<String> strings = Arrays.asList("1", "2", "3");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void test2() {
        List<Person> people = Arrays.asList(
                Person.builder().firstName("June").build(),
                Person.builder().firstName("June2").build()
        );

        for (Person person : people) {
            person.setExtra("extra");
        }
        System.out.println(people);
    }
}
