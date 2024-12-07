package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    // Sum method test
    @Test
    public void testSum() {
        int result = calculator.sum(5, 8);
        assertEquals(13, result, "Sum method failed");
    }

    // Subtraction method test
    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "Subtract method failed");
    }

    // Square method test for positive number
    @Test
    public void testSquareWithPositiveNumber() {
        int result = calculator.square(5);
        assertEquals(25, result, "Square method failed for positive number");
    }

    // Square method test for negative number
    @Test
    public void testSquareWithNegativeNumber() {
        int result = calculator.square(-3);
        assertEquals(9, result, "Square method failed for negative number");
    }

    // Square method test for a number equal to zero
    @Test
    public void testSquareWithZero() {
        int result = calculator.square(0);
        assertEquals(0, result, "Square method failed for zero");
    }
}

