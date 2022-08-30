package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

	static double getAverage(int[] numbers) {
		IntStream.range(0, numbers.length)
				.map(i -> numbers[i])
				.forEach(number -> System.out.println(number));

		return IntStream.range(0, numbers.length)
					.map(i -> numbers[i])
					.average()
					.getAsDouble();
	}

}
