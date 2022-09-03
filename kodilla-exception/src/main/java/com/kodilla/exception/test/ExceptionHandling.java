package com.kodilla.exception.test;

public class ExceptionHandling {

	public static void main(String[] args) {

		SecondChallenge secondChallenge = new SecondChallenge();
		double x = 3;
		double y = 2;
		String tryCatch = "";
		String result;

		try {
			secondChallenge.probablyIWillThrowException(x,y);
			tryCatch = "try";
		} catch (Exception e) {
			System.out.println("\nException details: " + e);
		} finally {
			result = (tryCatch.equals("try")) ? "There was no exception" : "Exception was handled";
			System.out.println("\nProgram has ended\n" + result);
		}

	}

}
