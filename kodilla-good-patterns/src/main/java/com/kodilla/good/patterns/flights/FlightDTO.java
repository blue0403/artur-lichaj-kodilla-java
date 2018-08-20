package com.kodilla.good.patterns.flights;

public final class FlightDTO {
    private final String departureAirport;
    private final String arrivalAirport;
    private final boolean isAvailable;

    public FlightDTO(String departureAirport, String arrivalAirport, boolean isAvailable) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.isAvailable = isAvailable;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
