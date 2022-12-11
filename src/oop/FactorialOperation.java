package oop;

public class FactorialOperation extends CalculationOperation {
    private int value;
    private int result;

    public FactorialOperation(String name, int value) {
        super(name);
        this.value = value;
    }

    @Override
    public void doCalculation() {
        result = 1;
        if (value < 0) {
            System.out.println("Die Zahl " + value + " ist kleiner als 0, daher ist keine Fakultät möglich.");
        }

        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
    }

    @Override
    public void printResult() {
        System.out.println("Die Fakultät für " + value + " lautet " + result);
    }


    @Override
    public String toString() {
        return "FactorialOperation{" +
                "value=" + value +
                ", result=" + result +
                '}';
    }
}
