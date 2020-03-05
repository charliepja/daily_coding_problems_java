import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DayTwoTest {
    DayTwo dayTwo;
    ArrayList<Integer> result;
    ArrayList<Integer> numbers;

    @Before
    public void before() {
        dayTwo = new DayTwo();
        numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        result = new ArrayList<Integer>();
        result.add(120);
        result.add(60);
        result.add(40);
        result.add(30);
        result.add(24);
    }

    @Test
    public void canSetArrayList() {
        dayTwo.setNumbers(numbers);
        assertEquals(5, dayTwo.totalNumbers());
    }

    @Test
    public void doesNotRunWhenEmptyArrayList() {
        dayTwo.productOfArray();
        assertEquals("No numbers", dayTwo.getResultMessage());
    }

    @Test
    public void doesNotRunWhenArrayListSizeLessThanThree() {
        numbers.remove(0);
        numbers.remove(1);
        numbers.remove(2);
        dayTwo.setNumbers(numbers);
        dayTwo.productOfArray();
        assertEquals("Not enough numbers", dayTwo.getResultMessage());
    }

    @Test
    public void returnsArrayListOfProductOfOriginalArrayList() {
        dayTwo.setNumbers(numbers);
        dayTwo.productOfArray();
        assertEquals(result, dayTwo.getResultNumbers());
    }
}
