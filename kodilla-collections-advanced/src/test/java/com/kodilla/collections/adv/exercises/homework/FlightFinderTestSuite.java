package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private final FlightFinder finder = new FlightFinder();

    @Test
    void shouldFindFlightsFromGivenCity() {
        verifyFlightsFrom("New York", 1, "London");
    }

    @Test
    void shouldFindFlightsToGivenCity() {
        verifyFlightsTo("Berlin", 1, "Paris");
    }

    @Test
    void shouldReturnEmptyListWhenNoFlightsFromGivenCity() {
        verifyNoFlightsFrom("Warsaw");
    }

    @Test
    void shouldReturnEmptyListWhenNoFlightsToGivenCity() {
        verifyNoFlightsTo("Warsaw");
    }

    private void verifyFlightsFrom(String departure, int expectedSize, String expectedArrival) {
        List<Flight> flights = finder.findFlightsFrom(departure);

        assertEquals(expectedSize, flights.size());
        if (expectedSize > 0) {
            assertEquals(expectedArrival, flights.get(0).getArrival());
        }
    }

    private void verifyFlightsTo(String arrival, int expectedSize, String expectedDeparture) {
        List<Flight> flights = finder.findFlightsTo(arrival);

        assertEquals(expectedSize, flights.size());
        if (expectedSize > 0) {
            assertEquals(expectedDeparture, flights.get(0).getDeparture());
        }
    }

    private void verifyNoFlightsFrom(String departure) {
        assertTrue(finder.findFlightsFrom(departure).isEmpty());
    }

    private void verifyNoFlightsTo(String arrival) {
        assertTrue(finder.findFlightsTo(arrival).isEmpty());
    }
}
