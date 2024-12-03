package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {
    public static void main(String[] args) {
        List<Square> Shapes = new ArrayList<>();
        Shapes.add(new Square(10.0));
        Shapes.add(new Square(5.0));
        Shapes.add(new Square(1.0));
        for (int n = 0; n < Shapes.size(); n++)
            System.out.println(Shapes.get(n));
    }
}
