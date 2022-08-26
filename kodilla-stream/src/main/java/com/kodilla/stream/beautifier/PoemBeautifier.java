package com.kodilla.stream.beautifier;

public class PoemBeautifier {

	public String beautify(String textToBeautify, PoemDecorator poemDecorator) {
		String output = poemDecorator.decorate(textToBeautify);
		System.out.println(output);
		return output;
	}

}
