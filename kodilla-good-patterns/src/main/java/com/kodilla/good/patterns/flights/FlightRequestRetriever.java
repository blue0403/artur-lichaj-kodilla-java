package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightRequestRetriever {

    public FlightRequest retrieve() {

        Flight WAW_LON = new Flight("Warsaw", "London");
        Flight WAW_CHI = new Flight("Warsaw", "Chicago");
        Flight WAW_FRA = new Flight("Warsaw", "Frankfurt");
        Flight GDA_KRK = new Flight("Gdansk", "Krakow");
        Flight KRK_WRO = new Flight("Krakow", "Frankfurt");
        Flight KRK_WAW = new Flight("Krakow", "Warsaw");
        Flight FRA_CHI = new Flight("Frankfurt", "Chicago");

        List<Flight> availableFlights = new ArrayList<>();
        availableFlights.add(WAW_LON);
        availableFlights.add(WAW_CHI);
        availableFlights.add(WAW_FRA);
        availableFlights.add(GDA_KRK);
        availableFlights.add(KRK_WRO);
        availableFlights.add(KRK_WAW);
        availableFlights.add(FRA_CHI);

        return new FlightRequest("Krakow", "Chicago" , availableFlights);
    }
}
