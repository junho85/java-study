package tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class MoneyTest {
    @Test
    public void test_MoneyTest() throws Exception {

    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(10);
        five.times(2);
        assertThat(five.amount).isEqualTo(20);
    }
}