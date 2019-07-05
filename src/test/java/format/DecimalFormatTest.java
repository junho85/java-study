package format;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;

public class DecimalFormatTest {
    @Test
    public void test() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        assertThat(formatter.format(123456789)).isEqualTo("123,456,789");
    }
}
