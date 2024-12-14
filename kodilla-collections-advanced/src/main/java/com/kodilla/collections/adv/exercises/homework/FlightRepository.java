package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static final List<Flight> flights = new ArrayList<>();

    static {
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("Paris", "Berlin"));
        flights.add(new Flight("Tokyo", "Sydney"));
        flights.add(new Flight("Berlin", "New York"));
        flights.add(new Flight("London", "Paris"));
    }

    public static List<Flight> getFlightsTable() {
        return new ArrayList<>(flights);
    }
}