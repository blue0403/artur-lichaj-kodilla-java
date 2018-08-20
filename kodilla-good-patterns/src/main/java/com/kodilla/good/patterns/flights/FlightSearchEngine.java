package com.kodilla.good.patterns.flights;

public interface FlightSearchEngine {
    boolean findFlight(final String departureAirport, final String arrivalAirport, final FlightRequest flightRequest);
}
