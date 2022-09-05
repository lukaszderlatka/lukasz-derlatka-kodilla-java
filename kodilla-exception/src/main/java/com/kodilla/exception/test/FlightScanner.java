package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

	public void findFlight(Flight flight) throws RouteNotFoundException {
		Map<String, Boolean> flightsRoute = new HashMap<>();
		flightsRoute.put("Katowice (KTW)", true);
		flightsRoute.put("Krakow (KRK)", false);
		flightsRoute.put("Rzeszow (RZE)", false);
		flightsRoute.put("Warszawa Chopina (WAW)", true);
		flightsRoute.put("Wroclaw (WRO)", true);

		if (!(flightsRoute.get(flight.getArrivalAirport()) && flightsRoute.get(flight.getDepartureAirport()))) {
			throw new RouteNotFoundException("\n-> Direct flight is not available");
		} else {
			System.out.println("\nFlight from " + flight.getDepartureAirport() + " to "
					+ flight.getArrivalAirport() + " is available\n");
		}
	}

}
