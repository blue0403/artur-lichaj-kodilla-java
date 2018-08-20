package com.kodilla.good.patterns.flights;

public final class FlightSearchProcessor {
    private final FlightSearchEngine flightSearchEngine;

    public FlightSearchProcessor(final FlightSearchEngine flightSearchEngine) {
        this.flightSearchEngine = flightSearchEngine;
    }

    public FlightDTO checkFlightAvailability(final FlightRequest flightRequest) {
        boolean isAvailable = flightSearchEngine.findFlight(flightRequest.getDepartureAirport(),
                flightRequest.getArrivalAirport(), flightRequest);

        if (isAvailable) {
            return  new FlightDTO(flightRequest.getDepartureAirport(), flightRequest.getArrivalAirport(), true);
        } else {
            return  new FlightDTO(flightRequest.getDepartureAirport(), flightRequest.getArrivalAirport(), false);
        }
    }
}
