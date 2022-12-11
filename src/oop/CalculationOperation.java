package oop;

import java.util.ArrayList;

public abstract class CalculationOperation {
    protected String name;
    public abstract void doCalculation();
    public abstract void printResult();

    public CalculationOperation(String name) {
        this.name = name;
    }
}
