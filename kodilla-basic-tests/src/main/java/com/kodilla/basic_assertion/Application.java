package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        int squareResult = calculator.square(2);
        boolean correct2 = ResultChecker.assertEquals(64,squareResult);
        if (correct1) {
            System.out.println("The sum method works correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The subtraction method works correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The square method works correctly for the number" + " " + b + " " + "square" + " " + "2" + ".");
        } else {
            System.out.println("The sum method does not work correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The subtraction method does not work correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The square method does not work correctly for the number" + " " + b + " " + "square" + " " + "2" +".");
        }
    }
}




