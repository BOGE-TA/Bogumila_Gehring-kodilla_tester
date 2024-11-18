package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public void turnOnLights() {
        System.out.println ("Lights were turned on");
    }

    public void openDoors () {
        System.out.println ("Opening 4 doors");
    }
    public Car (int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
        System.out.println ("Car constructor");
    }

}
