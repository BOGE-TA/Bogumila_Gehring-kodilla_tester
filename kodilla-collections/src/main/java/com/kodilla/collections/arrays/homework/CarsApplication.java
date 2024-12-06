package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int arraySize = RANDOM.nextInt(15) + 1; // Random size from 1 to 15
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("------------------");
        }
    }

    public static Car drawCar() {
        int carType = RANDOM.nextInt(3); // 0 - Ford, 1 - Opel, 2 - Mazda
        Car car;
        switch (carType) {
            case 0:
                car = new Ford();
                break;
            case 1:
                car = new Opel();
                break;
            case 2:
                car = new Mazda();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + carType);
        }

        // Random speed increase from 1 to 10 times
        int speedIncreaseTimes = RANDOM.nextInt(10) + 1;
        for (int i = 0; i < speedIncreaseTimes; i++) {
            car.increaseSpeed();
        }
        return car;
    }
}