package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("\nTest Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("\nOdd Numbers Exterminator Test Suite begins\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("\nOdd Numbers Exterminator Test Suite ends\n");
    }

    @DisplayName("When empty list is created, " +
		    "then exterminate method should return empty list as well"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
	    List<Integer> inputList = new ArrayList<>();
	    System.out.println("Testing behaviour using empty list");
	    OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        List<Integer> outputList = test.exterminate(inputList);
        //Then
	    Assertions.assertTrue(outputList.isEmpty());
    }

    @Test
    @DisplayName("When list with integer numbers is created, " +
		    "then exterminate method should return only even list"
    )

    void testOddNumbersExterminatorNormalList() {
		//Given
	    Integer numbers[] = new Integer[] {-5,-4,-3,-2,-1,0,1,2,3,4,5};
	    List<Integer> inputIntegerList = Arrays.asList(numbers);
	    Integer evenNumbers[] = new Integer[] {-4,-2,0,2,4};
	    List<Integer> expectedEvenList = Arrays.asList(evenNumbers);
	    System.out.println("The Normal list contains following integer numbers: " + inputIntegerList);
	    System.out.println("The expected result is: " + expectedEvenList);
	    OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        List<Integer> outputList = test.exterminate(inputIntegerList);
        //Then
	    Assertions.assertEquals(expectedEvenList,outputList);
    }
}
