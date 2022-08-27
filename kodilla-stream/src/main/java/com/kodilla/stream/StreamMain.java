package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

	public static void main(String[] args) {
		System.out.println("Welcome to module 7 - Stream");

		ExpressionExecutor expressionExecutor = new ExpressionExecutor();

		expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
		expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
		expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
		expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

		System.out.println("Calculating expressions with method references");
		expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
		expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
		expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
		expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

		System.out.println("\nTask 7.1\n");
		PoemBeautifier poemBeautifier = new PoemBeautifier();
		poemBeautifier.beautify("password", string -> "ABC" + string + "ABC");
		poemBeautifier.beautify("password", string -> string.toUpperCase());
		poemBeautifier.beautify("password", string -> string.replaceFirst("o","0"));
		poemBeautifier.beautify("password", string -> string.replaceAll("s","5"));
		poemBeautifier.beautify("password", string -> string.concat("!"));

		System.out.println("\nTask 7.2\n");
		System.out.println("Using Stream to generate even numbers from 1 to 20");
		NumbersGenerator.generateEven(20);
	}
}