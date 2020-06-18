package date;

import org.junit.Test;

import java.util.Calendar;

public class CalendarTest {
    @Test
    public void test_1year_term() {
        Calendar cal = Calendar.getInstance();
        final String startDt = Integer.toString(cal.get(Calendar.YEAR) * 10000 + (cal.get(Calendar.MONTH) + 1) * 100 + cal.get(Calendar.DATE));
        cal.add(Calendar.MONTH, 12);
        cal.add(Calendar.DATE, -1);
        final String endDt = Integer.toString(cal.get(Calendar.YEAR) * 10000 + (cal.get(Calendar.MONTH) + 1) * 100 + cal.get(Calendar.DATE));

        System.out.println(startDt);
        System.out.println(endDt);
    }
}
