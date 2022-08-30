package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

	@Test
	void testGetPeopleQuantity() {

		//Given
		Country china = new Country(new BigDecimal("1425893465"));
		Country india = new Country(new BigDecimal("1407563842"));
		Country indonesia = new Country(new BigDecimal("273753191"));
		Country pakistan = new Country(new BigDecimal("211103000"));

		Country germany = new Country(new BigDecimal("82800000"));
		Country france = new Country(new BigDecimal("67348000"));
		Country unitedKingdom = new Country(new BigDecimal("66040229"));
		Country italy = new Country(new BigDecimal("60589445"));

		Country unitesStates = new Country(new BigDecimal("336997624"));
		Country mexico = new Country(new BigDecimal("126705138"));
		Country canada = new Country(new BigDecimal("38155012"));

		Country brazil = new Country(new BigDecimal("214326223"));
		Country colombia = new Country(new BigDecimal("51516562"));
		Country argentina = new Country(new BigDecimal("45276780"));
		Country peru = new Country(new BigDecimal("33715471"));

		Continent asia = new Continent();
		asia.addCountry(china);
		asia.addCountry(india);
		asia.addCountry(indonesia);
		asia.addCountry(pakistan);

		Continent europe = new Continent();
		europe.addCountry(germany);
		europe.addCountry(france);
		europe.addCountry(unitedKingdom);
		europe.addCountry(italy);

		Continent northAmerica = new Continent();
		northAmerica.addCountry(unitesStates);
		northAmerica.addCountry(mexico);
		northAmerica.addCountry(canada);

		Continent southAmerica = new Continent();
		southAmerica.addCountry(brazil);
		southAmerica.addCountry(colombia);
		southAmerica.addCountry(argentina);
		southAmerica.addCountry(peru);

		World world = new World();
		world.addContinent(asia);
		world.addContinent(europe);
		world.addContinent(northAmerica);
		world.addContinent(southAmerica);

		//When
		BigDecimal actualCalculatedPopulation = world.getPeopleQuantity();

		//Then
		BigDecimal expectedCalculatedPopulation = new BigDecimal("4441783982");
		assertEquals(expectedCalculatedPopulation, actualCalculatedPopulation);
	}

}