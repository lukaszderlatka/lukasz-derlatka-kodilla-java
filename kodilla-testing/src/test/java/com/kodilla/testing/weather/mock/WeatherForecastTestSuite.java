package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
	private static int testCounter = 0;

	@Mock
	private static Temperatures temperaturesMock;
	Map<String, Double> temperaturesMap = new HashMap<>();

	@BeforeEach
	public void beforeEveryTest() {
		testCounter++;
		System.out.println("Preparing to execute Mock Test #" + testCounter);
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Loading data set...");
		temperaturesMap.put("Rzeszow", 25.5);
		temperaturesMap.put("Krakow", 26.2);
		temperaturesMap.put("Wroclaw", 24.8);
		temperaturesMap.put("Warszawa", 25.2);
		temperaturesMap.put("Gdansk", 26.1);
		when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
	}

	@AfterEach
	public void afterEach() { System.out.println("Mock Test #" + testCounter + " has ended.\n"); }

	@BeforeAll
	public static void beforeAll() { System.out.println("\nWeatherForecast Mock Test Suite has started.\n"); }

	@AfterAll
	public static void afterAll() {
		System.out.println("WeatherForecast Mock Test Suite has ended.\n");
	}

	@Test
	void testCalculateForecastWithMock() {
		//Given
		WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

		//When
		int quantityOfSensors = weatherForecast.calculateForecast().size();

		//Then
		assertEquals(5, quantityOfSensors);
	}

	@Test
	void testAverageTemperature() {
		//Given
		WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

		//When
		double actualAverage = weatherForecast.calculateAverageTemperature();

		//Then
		assertEquals(25.56, actualAverage);
	}

	@Test
	void testMedianTemperature() {
		//Given
		WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

		//When
		double actualMedian = weatherForecast.calculateMedianTemperature();

		//Then
		assertEquals(25.5, actualMedian);
	}
}