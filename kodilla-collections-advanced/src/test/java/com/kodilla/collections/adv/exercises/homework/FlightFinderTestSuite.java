
package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testFindFlightsFrom() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flights = finder.findFlightsFrom("New York");

        assertEquals(1, flights.size());
        assertEquals("London", flights.get(0).getArrival());
    }

    @Test
    void testFindFlightsTo() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flights = finder.findFlightsTo("Berlin");

        assertEquals(1, flights.size());
        assertEquals("Paris", flights.get(0).getDeparture());
    }

    @Test
    void testFindFlightsFrom_NoResults() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flights = finder.findFlightsFrom("Warsaw");

        assertTrue(flights.isEmpty());
    }

    @Test
    void testFindFlightsTo_NoResults() {
        FlightFinder finder = new FlightFinder();
        List<Flight> flights = finder.findFlightsTo("Warsaw");

        assertTrue(flights.isEmpty());
    }
}
