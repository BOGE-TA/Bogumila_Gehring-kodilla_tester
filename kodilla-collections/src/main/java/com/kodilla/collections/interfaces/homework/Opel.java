package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20; // Opel accelerates 20
    }

    @Override
    public void decreaseSpeed() {
        speed -= 15; // Opel brakes 15
    }
}