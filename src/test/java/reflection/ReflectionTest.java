package reflection;

import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Random;

public class ReflectionTest {

    public class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }


        //        private Person() {
//        }
//
//        static Person newInstance() {
//            return new Person();
//        }
    }
}
