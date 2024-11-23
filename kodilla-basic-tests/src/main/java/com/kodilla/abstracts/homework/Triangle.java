package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    @Override
    public void surfaceArea() {
      System.out.println ("Surface area of triangle = 0,5 x a x 5");
    }

    @Override
    public void circumference() {
        System.out.println ("Circumference of triangle = a+b+c");

    }
}
