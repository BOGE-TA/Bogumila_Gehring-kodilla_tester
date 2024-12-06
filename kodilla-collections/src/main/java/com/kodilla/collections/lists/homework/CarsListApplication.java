package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        // Creating a car collection
        List<Car> cars = new ArrayList<>();

        // Adding different cars to the collection
        cars.add(new Ford());
        cars.add(new Opel());
        cars.add(new Mazda());

        // Increasing the speed of cars
        cars.get(0).increaseSpeed(); // Ford accelerates 1 time
        cars.get(1).increaseSpeed(); // Opel accelerates 1 time
        cars.get(1).increaseSpeed(); // Opel accelerates 2 time
        cars.get(2).increaseSpeed(); // Mazda accelerates 1 time

        // Displaying the contents of a collection
        System.out.println("Initial collection:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("------------------");
        }

        // Removal of the car using the index
        cars.remove(1); // Removes Opel

        // Removal of the car using the object
        Car mazda = new Mazda();
        cars.remove(mazda); // Mazda will not be removed because it is a different instance

        // Displaying content after deletion
        System.out.println("After removals:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("------------------");
        }

        // Displaying the size of the collection
        System.out.println("Collection size: " + cars.size());
    }
}
