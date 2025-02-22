package com.kodilla.inheritance;

import com.kodilla.inheritance.homework.MacOS;
import com.kodilla.inheritance.homework.Windows;

public class Application {

    public static void main (String[] args) {
        Car car = new Car(4,5);
        car. turnOnLights();
        System.out.println(car.getWheels());
        System.out.println(car.getSeats());

        Convertible convertible = new Convertible (4,2);
        convertible.closeRoof();
        System.out.println(convertible.getSeats());
        System.out.println(convertible.getWheels());
        convertible.displayNumberOfSeats ();
      // Homework Operating System
        MacOS macOS= new MacOS(2001);
        macOS.turnOn();
        macOS.turnOff();

        Windows windows= new Windows (1985);
        windows.turnOn();
        windows.turnOff();
    }


}
