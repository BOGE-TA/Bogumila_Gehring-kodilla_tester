package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSquareWithPositiveNumber() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.square(5);

        // Then
        assertEquals(25, result, "Square of 5 should be 25");
    }

    @Test
    public void testSquareWithNegativeNumber() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.square(-4);

        // Then
        assertEquals(16, result, "Square of -4 should be 16");
    }

    @Test
    public void testSquareWithZero() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.square(0);

        // Then
        assertEquals(0, result, "Square of 0 should be 0");
    }
}

