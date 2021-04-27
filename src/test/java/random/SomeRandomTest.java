package random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class SomeRandomTest {

    @DisplayName("random number test")
    @RepeatedTest(100)
    void test() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        then(randomNumber)
                .as("check that random number is less than 10")
                .isLessThan(10);
    }
}