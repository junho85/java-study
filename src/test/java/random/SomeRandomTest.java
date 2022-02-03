package random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
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

    @DisplayName("random number test")
    @RepeatedTest(100)
    void test(RepetitionInfo repetitionInfo) {
        System.out.println("repetition " + repetitionInfo.getCurrentRepetition()
                + " of " + repetitionInfo.getTotalRepetitions());

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        then(randomNumber)
                .as("check that random number is less than 10")
                .isLessThan(10);
    }

    @Test
    void test_math_random() {
        System.out.println(Math.random());
    }

    @Test
    void test_secure_random() {
        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
    }
}