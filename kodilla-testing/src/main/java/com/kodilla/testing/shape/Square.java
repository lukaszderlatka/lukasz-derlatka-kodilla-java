package com.kodilla.testing.shape;

public class Square implements Shape {
	private String name;
	private double side;

	public Square(String name, double side) {
		this.name = name;
		this.side = side;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getShapeName() {
		return name;
	}

	public double getField() {
		return side * side;
	}
}
