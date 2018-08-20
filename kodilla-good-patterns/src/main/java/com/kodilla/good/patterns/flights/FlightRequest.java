package com.kodilla.good.patterns.flights;

import java.util.List;

public final class FlightRequest {
    private String departureAirport;
    private String arrivalAirport;
    private final List<Flight> possibleFlightsList;

    public FlightRequest(String departureAirport, String arrivalAirport, List<Flight> possibleFlightsList) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.possibleFlightsList = possibleFlightsList;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public List<Flight> getPossibleFlightsList() {
        return possibleFlightsList;
    }
}
