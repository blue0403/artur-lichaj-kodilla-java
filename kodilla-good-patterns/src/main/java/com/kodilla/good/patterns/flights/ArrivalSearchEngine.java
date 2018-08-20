package com.kodilla.good.patterns.flights;

public final class ArrivalSearchEngine implements FlightSearchEngine {

    @Override
    public boolean findFlight(final String departureAirport, final String arrivalAirport, final FlightRequest flightRequest) {
        boolean result = false;

        if(arrivalAirport != null && flightRequest.getArrivalAirport().equals(arrivalAirport)) {
            System.out.println("Flights available to " + arrivalAirport + ":\n");
            flightRequest.getPossibleFlightsList().stream()
                    .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                    .forEach(System.out::println);

            result = true;
        }
        return result;
    }
}
