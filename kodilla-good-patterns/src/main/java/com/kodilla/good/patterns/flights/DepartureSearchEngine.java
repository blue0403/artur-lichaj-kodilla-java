package com.kodilla.good.patterns.flights;

public final class DepartureSearchEngine implements FlightSearchEngine {

    @Override
    public boolean findFlight(final String departureAirport, final String arrivalAirport, final FlightRequest flightRequest) {
        boolean result = false;

        if(departureAirport != null && flightRequest.getDepartureAirport().equals(departureAirport)) {
            System.out.println("Flights available from " + departureAirport + ":\n");
            flightRequest.getPossibleFlightsList().stream()
                    .filter(f -> f.getDepartureAirport().equals(departureAirport))
                    .forEach(System.out::println);

            result = true;
        }
        return result;
    }
}
