import java.util.ArrayList;

public class DayOne {
    private Integer k;
    private ArrayList<Integer> numbers;

    public DayOne(Integer k, ArrayList<Integer> numbers) {
        this.k = k;
        this.numbers = numbers;
    }

    public int getK() {
        return this.k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int numberTotal() {
        int total = 0;
        for(Integer number : numbers) {
            total += number;
        }
        return total;
    }

    public int getNumbersSize() {
        return this.numbers.size();
    }

    public boolean canGetValueK() {
        if (getNumbersSize() < 2) {
            return false;
        }
        int firstValue = numbers.get(0);
        boolean canGetK = false;

        for(int i = 1; i < getNumbersSize(); i++) {
            Integer arrayValue = numbers.get(i);
            int result = arrayValue + firstValue;

            if(result == getK()) {
                return canGetK = true;
            }
        }

        return canGetK;
    }
}
