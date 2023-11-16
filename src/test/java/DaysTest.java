import Lesson8.Days;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DaysTest {
@Test
    public void WeekTest(){
    int dayNumber = 2;
    String expectedResult = "Monday";
    String actualResult = Days.getDay(dayNumber);
    assertEquals(expectedResult, actualResult);
 }
 @Test
 public void DaysOtr(){
    int  dayNumber = 1;
    String expectedResult = "The number should be equal or larger than 1";
    String actualResult = Days.getDay(dayNumber-1);
    assertEquals(expectedResult,actualResult);
}
@Test
    public void DaysSevenPlus() {
    int dayNumber = 8;
    String expectedResult = "The number should be equal or smaller than 7";
    String actualResult = Days.getDay(dayNumber - 1);
    assertEquals(expectedResult, actualResult);
}
    @Test
    public void DaysNull(){
        Integer dayNumber = null;
        String actualResult = Days.getDay(dayNumber);
        assertNull(actualResult);

    }
}
