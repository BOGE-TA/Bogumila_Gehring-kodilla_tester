package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;

import java.util.ArrayList;
import java.util.List;

class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }
}
