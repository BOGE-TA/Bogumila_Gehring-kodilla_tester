package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

class PersonTest {

    // Downloading test data from a separate class.
    static Stream<PersonTestData.TestData> provideTestData() {
        return PersonTestData.getTestData();
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testGetBMI(PersonTestData.TestData testData) {
        // Creating a Person object
        Person person = new Person(testData.height, testData.weight);

        // Verification of the correctness of the BMI classification
        assertEquals(testData.expectedCategory, person.getBMI());
    }
}

