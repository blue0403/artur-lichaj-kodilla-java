package com.kodilla.good.patterns.flights;

public final class Application {

    public static void main(String[] args) {

        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightSearchProcessor departureSearchProcessor = new FlightSearchProcessor(new DepartureSearchEngine());
        FlightSearchProcessor arrivalSearchProcessor = new FlightSearchProcessor(new ArrivalSearchEngine());
        FlightSearchProcessor connectingFlightsSearchProcessor = new FlightSearchProcessor(new ConnectingFlightsSearchEngine());

        departureSearchProcessor.checkFlightAvailability(flightRequest);
        arrivalSearchProcessor.checkFlightAvailability(flightRequest);
        connectingFlightsSearchProcessor.checkFlightAvailability(flightRequest);
    }
}
