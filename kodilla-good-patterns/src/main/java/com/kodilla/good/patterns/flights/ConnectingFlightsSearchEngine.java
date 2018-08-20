package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public final class ConnectingFlightsSearchEngine implements FlightSearchEngine {

    @Override
    public boolean findFlight(final String departureAirport, final String arrivalAirport, final FlightRequest flightRequest) {
        boolean result = false;

        if(departureAirport != null && flightRequest.getDepartureAirport().equals(departureAirport) &&
                arrivalAirport != null && flightRequest.getArrivalAirport().equals(arrivalAirport)) {

            List<Flight> flightsFromDepartureAirport = flightRequest.getPossibleFlightsList().stream()
                    .filter(f -> f.getDepartureAirport().equals(departureAirport))
                    .collect(Collectors.toList());

            List<String> namesOfIntermediateAirports = flightRequest.getPossibleFlightsList().stream()
                    .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                    .map(Flight::getDepartureAirport)
                    .collect(Collectors.toList());

            List<Flight> firstConnectingFlights = flightsFromDepartureAirport.stream()
                    .filter(f -> namesOfIntermediateAirports.contains(f.getArrivalAirport()))
                    .collect(Collectors.toList());

            List<Flight> secondConnectingFlights = flightRequest.getPossibleFlightsList().stream()
                    .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                    .filter(f -> f.getDepartureAirport().equals(firstConnectingFlights.get(0).getArrivalAirport()) ||
                            f.getDepartureAirport().equals(firstConnectingFlights.get(1).getArrivalAirport()))
                    .collect(Collectors.toList());

            result = flightsFromDepartureAirport.stream()
                    .filter(f -> namesOfIntermediateAirports.contains(f.getArrivalAirport()))
                    .count() >= 1;

            if (result) {
                System.out.println("Available connecting flights from " + departureAirport + " to " + arrivalAirport +
                        ":\n\nFirst flight:");
                firstConnectingFlights.forEach(System.out::println);
                System.out.println("Second flight:");
                secondConnectingFlights.forEach(System.out::println);
            }
        }
        return result;
    }
}
