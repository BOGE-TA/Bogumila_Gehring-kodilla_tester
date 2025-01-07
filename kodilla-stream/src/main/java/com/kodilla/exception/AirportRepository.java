package com.kodilla.exception;

public class AirportRepository {
    private Map <String, Boolean> getListOfAirports(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put ("Miami", true);
        airports.put("Malta", true);
    }
}
