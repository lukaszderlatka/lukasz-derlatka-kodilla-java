package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
	public List<Shape> shapesList = new ArrayList<>();

	public void addFigure(Shape shape) {
		shapesList.add(shape);
	}

	public void removeFigure(Shape shape) {
		shapesList.remove(shape);
	}

	public Shape getFigure(int n) {
		Shape theFigure = null;
		if (n >= 0 && n < shapesList.size()) {
			theFigure = shapesList.get(n);
		}
		return theFigure;
	}

	public String showFigures() {
		return shapesList.toString();
	}
}