package introduktionTillProgrammeringUppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void testCalcChars() {
        //Arrange
        Counter cn = new Counter();
        cn.calcChars("hello");

        assertEquals(5, cn.getNumCharsCount());

    }
    @Test
    public void testCalcRows() {
        Counter cn = new Counter();
        cn.calcRows();

        assertEquals(1, cn.getRowCount());
    }
    @Test
    public void testCalcWords() {
        Counter cn = new Counter();
        cn.calcWords("hej kompis");

        assertEquals(2, cn.getNumWords());
    }

    @Test
    public void testCheckStop(){
        Counter cn = new Counter();
        cn.calcCheckStop("stop");
        assertEquals(true, cn.getCheckStop());
    }
}
