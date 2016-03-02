import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by blstream on 3/2/2016.
 */
public class TimeTest {

    @Test
    public void testShowTime() throws Exception {
        Time [] time = new Time[4];
        time[0] =  new Time("00:00:00");
        time[1] =  new Time("13:17:01");
        time[2] =  new Time("23:59:59");
        time[3] =  new Time("24:00:00");

        assertEquals("Y OOOO OOOO OOOOOOOOOOO OOOO", time[0].showTime());
        assertEquals("O RROO RRRO YYROOOOOOOO YYOO", time[1].showTime());
        assertEquals("O RRRR RRRO YYRYYRYYRYY YYYY", time[2].showTime());
        assertEquals("Y RRRR RRRR OOOOOOOOOOO OOOO", time[3].showTime());

    }
}