package com.example.a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorUnitTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void classifiesValues() {
        assertEquals("positive", calculator.classify(4));
        assertEquals("negative", calculator.classify(-4));
        assertEquals("zero", calculator.classify(0));
    }
}
