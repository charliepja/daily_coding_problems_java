import java.util.ArrayList;

public class DayTwoResult {
    private String message;
    private ArrayList<Integer> results;

    public DayTwoResult() {
        results = new ArrayList<Integer>();
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Integer> getResults() {
        return this.results;
    }

    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    public void addNumber(Integer newNumber) {
        this.results.add(newNumber);
    }
}
