package com.kodilla.exception.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Second Challenge Test Suite")
public class SecondChallengeTestSuite {

	@DisplayName("Test should throw exception")
	@Test
	void testProbablyIWillThrowException() {
		// given
		SecondChallenge secondChallenge = new SecondChallenge();

		// when & then
		assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
		assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 3));
	}

	@DisplayName("Test should not throw exception")
	@Test
	void testProbablyIWillNotThrowException() {
		// given
		SecondChallenge secondChallenge = new SecondChallenge();

		// when & then
		assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 0));
	}

}
