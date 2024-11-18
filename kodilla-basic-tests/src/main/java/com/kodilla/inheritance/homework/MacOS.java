package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS(int yearOfOperatingSystem) {
        super(yearOfOperatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println ("Turn on MacOS System");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println ("Turn off MacOs System");
    }
}
