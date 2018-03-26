package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");

        Country poland = new Country("Poland", new BigDecimal("37950000"));
        Country germany = new Country("Germany", new BigDecimal("82670000"));
        Country france = new Country("France", new BigDecimal("66900000"));
        Country spain = new Country("Spain", new BigDecimal("46560000"));
        Country unitedKingdom = new Country("United Kingdom", new BigDecimal("65640000"));

        Country russia = new Country("Russia", new BigDecimal("144300000"));
        Country china = new Country("China", new BigDecimal("1379000000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country india = new Country("India", new BigDecimal("1324000000"));
        Country iran = new Country("Iran", new BigDecimal("80280000"));

        Country kenya = new Country("Kenya", new BigDecimal("48460000"));
        Country morocco = new Country("Morocco", new BigDecimal("33990000"));
        Country algeria = new Country("Algeria", new BigDecimal("40610000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("186000000"));
        Country somalia = new Country("Somalia", new BigDecimal("14320000"));

        Country uSA = new Country("United States", new BigDecimal("325700000"));
        Country canada = new Country("Canada", new BigDecimal("36290000"));
        Country mexico = new Country("Mexico", new BigDecimal("127500000"));

        Country brazil = new Country("Brazil", new BigDecimal("207700000"));
        Country argentina = new Country("Argentina", new BigDecimal("44290000"));
        Country chile = new Country("Chile", new BigDecimal("17789000"));
        Country venezuela = new Country("Venezuela", new BigDecimal("31570000"));

        //When
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(spain);
        europe.addCountry(unitedKingdom);

        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);
        asia.addCountry(iran);

        africa.addCountry(kenya);
        africa.addCountry(morocco);
        africa.addCountry(algeria);
        africa.addCountry(nigeria);
        africa.addCountry(somalia);

        northAmerica.addCountry(uSA);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(venezuela);

        //Then
        Assert.assertEquals(new BigDecimal("4468519000"), world.getPeopleQuantity());
    }
}
