package format;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;

public class DecimalFormatTest {
    @Test
    public void test() {
        DecimalFormat df1 = new DecimalFormat("#,###");
        assertThat(df1.format(123456789)).isEqualTo("123,456,789");

        DecimalFormat df2 = new DecimalFormat("###,###");
        assertThat(df2.format(123456789)).isEqualTo("123,456,789");
    }
}
