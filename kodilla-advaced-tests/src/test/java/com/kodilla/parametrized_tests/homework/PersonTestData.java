package com.kodilla.parametrized_tests.homework;

import java.util.stream.Stream;

class PersonTestData {

    // Structure for storing test data
    static class TestData {
        double height;
        double weight;
        String expectedCategory;

        TestData(double height, double weight, String expectedCategory) {
            this.height = height;
            this.weight = weight;
            this.expectedCategory = expectedCategory;
        }
    }

    // Method returning a test data set
    static Stream<TestData> getTestData() {
        return Stream.of(
                new TestData(1.75, 50, "Underweight"),
                new TestData(1.75, 70, "Normal (healthy weight)"),
                new TestData(1.75, 85, "Overweight"),
                new TestData(1.75, 100, "Obese Class I (Moderately obese)"),
                new TestData(1.75, 120, "Obese Class II (Severely obese)"),
                new TestData(1.75, 140, "Obese Class III (Very severely obese)"),
                new TestData(1.75, 160, "Obese Class IV (Morbidly Obese)"),
                new TestData(1.75, 200, "Obese Class V (Super Obese)"),
                new TestData(1.75, 250, "Obese Class VI (Hyper Obese)")
        );
    }
}
