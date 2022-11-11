package introduktionTillProgrammeringUppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void testCalcChars() {
        //Arrange
        Counter cn = new Counter();
        String String = "";
        cn.calcChars(String);

        assertEquals(String, String);

    }
    @Test
    public void test_getRowCount() {

    }
    @Test
    public void test_getNumCharsCount() {

    }

}
