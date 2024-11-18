package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int yearOfOperatingSystem) {
        super(yearOfOperatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Windows System");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Windows system");
    }
}
