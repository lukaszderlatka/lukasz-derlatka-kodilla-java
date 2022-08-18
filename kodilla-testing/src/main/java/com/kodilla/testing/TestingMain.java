package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Task 6.2 - First unit test");
        System.out.print("Testing calculator's addition functionality: ");
        Calculator calculator = new Calculator(12,7);
        int sum = calculator.add(12, 7);

        if (sum == 19) {
            System.out.println("Addition test passed");
        } else {
            System.out.println("Addition test failed");
        }

        System.out.print("Testing calculator's subtraction functionality: ");
        int difference = calculator.subtract(12, 7);

        if (difference == 5) {
            System.out.println("Subtraction test passed");
        } else {
            System.out.println("Subtraction test failed");
        }
    }
}