package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3,subtractResult);
        if (correct1) {
            System.out.println("The sum method works correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The subtraction method works correctly for the numbers" + " "  +  a  + " " +  "and" + " "  +  b + ".");
        } else {
            System.out.println("The sum method does not work correctly for the numbers" + " " + a + " " + "and" + " " + b + ".");
            System.out.println("The subtraction method does not work correctly for the numbers" + " "  +  a  + " " +  "and" + " "  +  b + ".");
        }
        // Test dla liczby dodatniej
        int result1 = calculator.square(5);
        System.out.println("Square of 5: " + result1); // Oczekiwany wynik: 25

        // Test dla liczby ujemnej
        int result2 = calculator.square(-3);
        System.out.println("Square of -3: " + result2); // Oczekiwany wynik: 9

        // Test dla zera
        int result3 = calculator.square(0);
        System.out.println("Square of 0: " + result3); // Oczekiwany wynik: 0
    }
}



