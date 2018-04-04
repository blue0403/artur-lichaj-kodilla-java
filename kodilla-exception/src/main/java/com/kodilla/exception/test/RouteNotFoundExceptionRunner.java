package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) {

        Flight WAW_MOS = new Flight("Warsaw", "Moscow");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            flightSearchEngine.findFlight(WAW_MOS);

        } catch (RouteNotFoundException e) {
            System.out.println("We are so sorry, flight to this airport is not possible");
        }
    }
}
