package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Car make: " + getCarName(car));
        System.out.println("Current speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof com.kodilla.collections.interfaces.homework.Ford) {
            return "Ford";
        } else if (car instanceof com.kodilla.collections.interfaces.homework.Opel) {
            return "Opel";
        } else if (car instanceof com.kodilla.collections.interfaces.homework.Mazda) {
            return "Toyota";
        } else {
            return "Unknown Car";
        }
    }
}