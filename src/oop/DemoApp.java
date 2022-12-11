package oop;

import java.util.ArrayList;

public class DemoApp {

    public static void main(String[] args) {
        System.out.println("\nSummationOperation");
        SummationOperation summationOperation = new SummationOperation("Summe von 2 und 4", 2, 4);
        summationOperation.doCalculation();
        summationOperation.printResult();
        System.out.println("summationOperation = " + summationOperation);

        System.out.println("\nAverageOperation");
        AverageOperation averageOperation = new AverageOperation("Durchschnitt", new ArrayList<>());
        averageOperation.add(5);
        averageOperation.add(4);
        averageOperation.add(7);
        averageOperation.doCalculation();
        averageOperation.printResult();
        System.out.println("averageOperation = " + averageOperation);

        System.out.println("\nFactorialOperation");
        FactorialOperation factorialOperation = new FactorialOperation("Fakultät von 6", 6);
        factorialOperation.doCalculation();
        factorialOperation.printResult();
        System.out.println("factorialOperation = " + factorialOperation);
    }
}