package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GamblingMachineTest {

    private final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv", numLinesToSkip = 1)
    void testHowManyWinsWithValidNumbers(String numbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = parseNumbers(numbers);
        int result = gamblingMachine.howManyWins(userNumbers);
        Assertions.assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    void testHowManyWinsWithInvalidNumbers(String numbers) {
        Set<Integer> userNumbers = parseNumbers(numbers);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    private Set<Integer> parseNumbers(String numbers) {
        return Stream.of(numbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }
}