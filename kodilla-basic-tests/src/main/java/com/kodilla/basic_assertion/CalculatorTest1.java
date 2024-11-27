package com.kodilla.basic_assertion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest1 {

        @Test
        public void testSum() {
            // Given
            Calculator calculator = new Calculator();

            // When
            int result = calculator.sum(5, 3);

            // Then
            assertEquals(String.valueOf(8), result, "Sum of 5 and 3 should be 8");
        }

        @Test
        public void testSubtract() {
            // Given
            Calculator calculator = new Calculator();

            // When
            int result = calculator.subtract(10, 4);

            // Then
            assertEquals(String.valueOf(6), result, "Subtraction of 10 and 4 should be 6");
        }

        @Test
        public void testSquareWithPositiveNumber() {
            // Given
            Calculator calculator = new Calculator();

            // When
            int result = calculator.square(5);

            // Then
            assertEquals(String.valueOf(25), result, "Square of 5 should be 25");
        }

        @Test
        public void testSquareWithNegativeNumber() {
            // Given
            Calculator calculator = new Calculator();

            // When
            int result = calculator.square(-3);

            // Then
            assertEquals(String.valueOf(9), result, "Square of -3 should be 9");
        }

        @Test
        public void testSquareWithZero() {
            // Given
            Calculator calculator = new Calculator();

            // When
            int result = calculator.square(0);

            // Then
            assertEquals(String.valueOf(0), result, "Square of 0 should be 0");
        }
    }

