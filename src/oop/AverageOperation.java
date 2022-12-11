package oop;

import java.util.ArrayList;

public class AverageOperation extends CalculationOperation {

    private ArrayList<Integer> listOfValues;
    private double result;

    public AverageOperation(String name, ArrayList<Integer> listOfValues) {
        super(name);
        this.listOfValues = listOfValues;
    }

    public void add(int value) {
        listOfValues.add(value);
    }


    @Override
    public void doCalculation() {
        int sum = 0;
        for (Integer value : listOfValues) {
            sum = sum + value;

        }
        result = sum / listOfValues.size();

    }

    @Override
    public void printResult() {
        System.out.println("Der Durschnitt beträgt " + result);

    }

    @Override
    public String toString() {
        return "AverageOperation{" +
                "listOfValues=" + listOfValues +
                ", result=" + result +
                '}';
    }
}
