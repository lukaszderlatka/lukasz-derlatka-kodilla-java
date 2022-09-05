package com.kodilla.exception.test;

public class FlightScannerApplication {

	public static void main(String[] args) {
		FlightScanner scanner = new FlightScanner();

		try {
			System.out.println("\nSearching your flight ...");
			scanner.findFlight(new Flight("Rzeszow (RZE)", "Wroclaw (WRO)"));
		} catch (RouteNotFoundException e) {
			System.out.println("\nException " + e);
		} finally {
			System.out.println("\nCheck our other popular destinations ...");
		}

		try {
			System.out.println("\nSearching your flight ...");
			scanner.findFlight(new Flight("Katowice (KTW)", "Wroclaw (WRO)"));
		} catch (RouteNotFoundException e) {
			System.out.println("No such flight " + e);
		} finally {
			System.out.println("Check our other popular destinations ...");
		}
	}

}
