package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford();
        Car opel = new Opel();
        Car toyota = new Mazda();

        System.out.println("Ford:");
        doRace(ford);
        System.out.println("\nOpel:");
        doRace(opel);
        System.out.println("\nMazda:");
        doRace(toyota);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Final speed: " + car.getSpeed());
    }
}