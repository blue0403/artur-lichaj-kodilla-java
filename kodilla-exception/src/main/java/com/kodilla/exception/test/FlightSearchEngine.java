package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("Warsaw", true);
        possibleFlights.put("Chicago", true);
        possibleFlights.put("New York", true);
        possibleFlights.put("Tokyo", false);
        possibleFlights.put("Sydney", false);

        if (possibleFlights.containsKey(flight.getDepartureAirport()) && possibleFlights.containsValue(true)) {
            System.out.println("Flight to " + flight.getDepartureAirport() + " is available");

        } else if (possibleFlights.containsKey(flight.getDepartureAirport()) && possibleFlights.containsValue(false)){
            System.out.println("Flight to " + flight.getDepartureAirport() + " is temporarily unavailable");
        }
        throw new RouteNotFoundException("Flight to this airport is not available");
    }
}
