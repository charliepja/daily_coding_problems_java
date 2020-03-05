import java.util.ArrayList;

public class DayTwo {
    private ArrayList<Integer> numbers;
    private DayTwoResult results;

    public DayTwo() {
        numbers = new ArrayList<Integer>();
        results = new DayTwoResult();
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

    public DayTwoResult getResults() {
        return this.results;
    }

    public String getResultMessage() {
        return this.results.getMessage();
    }

    public ArrayList<Integer> getResultNumbers() {
        return this.results.getResults();
    }

    public void productOfArray() {
        if(totalNumbers() < 3) {
            this.results.setMessage("Not enough numbers");
        }
        
        if(this.numbers.isEmpty()) {
            this.results.setMessage("No numbers");
        }
        for(Integer number : numbers) {
            Integer indexRemovedNumber = numbers.indexOf(number);
            Integer total = 1;
            for(Integer newNumber : numbers) {
                if(numbers.indexOf(newNumber) == indexRemovedNumber) {
                    continue;
                }
                total = total * newNumber;
            }
            this.results.addNumber(total);
        }
    }
}
