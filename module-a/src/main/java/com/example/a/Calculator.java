package com.example.a;

/**
 * Simple calculator used to demonstrate JaCoCo coverage in module-a.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Branch logic so coverage reports show both instruction and branch coverage.
     */
    public String classify(int value) {
        if (value > 0) {
            return "positive";
        } else if (value < 0) {
            return "negative";
        }
        return "zero";
    }
}
