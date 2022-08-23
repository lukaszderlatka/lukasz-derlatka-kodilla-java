package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

	private static int testCounter = 0;

	@BeforeEach
	public void before() {
		testCounter++;
		System.out.println("Preparing to execute test #" + testCounter);
		System.out.println("\nTest Case: begin");
	}

	@AfterEach
	public void after() {
		System.out.println("Test Case: end");
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("\nShape Collector Test Suite begins\n");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("\nShape Collector Test Suite ends\n");
	}

	@Nested
	class OperationsOnCollection {
		@DisplayName("When a shape object is created, " +
				"then testAddFigure() method should add it to collection"
		)

		@Test
		void testAddFigure() {
			//Given
			Triangle triangle = new Triangle("triangle1", 6,8);
			ShapeCollector shapeCollector = new ShapeCollector();

			//When
			shapeCollector.addFigure(triangle);

			//Then
			assertEquals(1, shapeCollector.shapesList.size());
		}

		@DisplayName("When a shape object is created, " +
				"then testRemoveFigure() method should remove it from collection"
		)

		@Test
		void testRemoveFigure() {
			//Given
			Square square = new Square("square1", 8);
			ShapeCollector shapeCollector = new ShapeCollector();
			shapeCollector.addFigure(square);

			//When
			shapeCollector.removeFigure(square);

			//Then
			assertEquals(0, shapeCollector.shapesList.size());
		}
	}

	@Nested
	class OperationsOnShapes {
		@DisplayName("When a shape object is created, " +
				"then testGetFigure() method should return it from collection"
		)

		@Test
		void testGetFigure() {
			//Given
			Circle circle = new Circle("circle1",4);
			ShapeCollector shapeCollector = new ShapeCollector();
			shapeCollector.addFigure(circle);

			//When
			Shape expectedShape = shapeCollector.getFigure(0);

			//Then
			assertEquals(circle,expectedShape);
		}

		@DisplayName("When shape objects are added to collection, " +
				"then showFigures() method should return them in one line"
		)

		@Test
		void testShowFigures() {
			//Given
			Circle circle = new Circle("circle1",4);
			Square square = new Square("square1", 8);
			Triangle triangle = new Triangle("triangle1",6,8);
			ShapeCollector shapeCollector = new ShapeCollector();
			shapeCollector.addFigure(circle);
			shapeCollector.addFigure(square);
			shapeCollector.addFigure(triangle);

			//When
			String expectedString = shapeCollector.showFigures();

			//Then
			assertEquals("[circle1, square1, triangle1]",expectedString);
			//assertLinesMatch(shapeCollector.toString().lines(), expectedString.lines());
		}

		@DisplayName("When a shape object is created, " +
				"then getField() method should return surface area"
		)

		@Test
		void testGetField() {
			//Given
			Triangle triangle = new Triangle("triangle1",6,8);
			ShapeCollector shapeCollector = new ShapeCollector();
			shapeCollector.addFigure(triangle);

			//When
			double expectedField = shapeCollector.getFigure(0).getField();

			//Then
			assertEquals(24,expectedField);
		}
	}
}
