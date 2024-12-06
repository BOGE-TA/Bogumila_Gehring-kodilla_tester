package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25; // Mazda accelerates 25
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20; // Mazda brakes 20
    }
}