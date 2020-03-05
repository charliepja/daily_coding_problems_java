import java.util.ArrayList;

public class DayTwo {
    private ArrayList<Integer> numbers;

    public DayTwo() {
        numbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int totalNumbers() {
        return this.numbers.size();
    }

    public void addNumber(Integer newNumber) {
        this.numbers.add(newNumber);
    }
}
