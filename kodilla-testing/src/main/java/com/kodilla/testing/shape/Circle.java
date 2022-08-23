package com.kodilla.testing.shape;

public class Circle implements Shape {
	private String name;
	private double radius;
	private double PI = 3.14;

	@Override
	public String toString() {
		return name;
	}

	public Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}

	public String getShapeName() {
		return name;
	}

	public double getField() {
		return PI * radius * radius;
	}
}
