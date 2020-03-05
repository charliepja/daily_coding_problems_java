import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DayTwoTest {
    DayTwo dayTwo;
    ArrayList<Integer> result;

    @Before
    public void before() {
        dayTwo = new DayTwo();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        dayTwo.setNumbers(numbers);
        result = new ArrayList<Integer>();
        result.add(120);
        result.add(60);
        result.add(40);
        result.add(30);
        result.add(24);
    }

    @Test
    public void canSetArrayList() {
        assertEquals(5, dayTwo.totalNumbers());
    }

    @Test
    public void doesNotRunWhenEmptyArrayList() {
        assertEquals("No numbers", dayTwo.productOfArray());
    }

    @Test
    public void doesNotRunWhenArrayListSizeLessThanThree() {
        assertEquals("Not enough numbers", dayTwo.productOfArray());
    }

    @Test
    public void returnsArrayListOfProductOfOriginalArrayList() {
        assertEquals(result, dayTwo.productOfArray());
    }
}
