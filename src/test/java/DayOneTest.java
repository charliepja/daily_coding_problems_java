import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DayOneTest {
    DayOne dayOne;

    @Before
    public void before() {
        ArrayList<Integer> listOfNumber;
        listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(10);
        listOfNumber.add(15);
        listOfNumber.add(3);
        listOfNumber.add(7);
        dayOne = new DayOne(17, listOfNumber);
    }

    @Test
    public void canGetValueOfK() {
        assertEquals(17, dayOne.getK());
    }

    @Test
    public void canGetSizeOfNumbersList() {
        assertEquals(4, dayOne.getNumbersSize());
    }

    @Test
    public void canGetTotalAllNumbers() {
        assertEquals(35, dayOne.numberTotal());
    }

    @Test
    public void returnsTrueWhenConditionMet() {
        assertTrue(dayOne.canGetValueK());
    }

    @Test
    public void returnsFalseWhenConditionNotMet() {
        dayOne.setK(20);
        assertFalse(dayOne.canGetValueK());
    }
}
