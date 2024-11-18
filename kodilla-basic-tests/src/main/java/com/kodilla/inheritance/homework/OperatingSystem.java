package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfOperatingSystem;

    public void turnOn() {
        System.out.println ("Turn on Computer");
    }

    public void turnOff () {
        System.out.println ("Turn off Computer");
    }

    public OperatingSystem (int yearOfOperatingSystem) {
        this.yearOfOperatingSystem= yearOfOperatingSystem;
    }

}
