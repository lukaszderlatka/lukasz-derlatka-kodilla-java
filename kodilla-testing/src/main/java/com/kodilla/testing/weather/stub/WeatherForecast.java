package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
	private Temperatures temperatures;

	public WeatherForecast(Temperatures temperatures) {
		this.temperatures = temperatures;
	}

	public Map<String, Double> calculateForecast() {
		Map<String, Double> resultMap = new HashMap<>();

		for (Map.Entry<String, Double> temperature :
				temperatures.getTemperatures().entrySet()) {

			// adding 1 celsius degree to current value
			// as a temporary weather forecast
			resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
		}
		return resultMap;
	}

	public double calculateAverageTemperature() {
		double temperatureDatasetSum = 0;
		for (Double temperature : temperatures.getTemperatures().values()) {
			temperatureDatasetSum += temperature;
		}
		return temperatureDatasetSum / temperatures.getTemperatures().size();
	}

	public double calculateMedianTemperature() {
		double medianValue = 0.0;
		List<Double> temperatureDataset = new ArrayList<>();
		for (Double temperature : temperatures.getTemperatures().values()) {
			temperatureDataset.add(temperature);
		}
		Collections.sort(temperatureDataset);
		if(temperatureDataset.size() % 2 == 0) {
			double temperatureDatasetSum = (double) (temperatureDataset.get(temperatureDataset.size()/2)
								+ temperatureDataset.get(temperatureDataset.size()/2));
			medianValue = temperatureDatasetSum / 2;

		} else {
			medianValue = temperatureDataset.get(temperatureDataset.size()/2);
		}
		return medianValue;
	}
}