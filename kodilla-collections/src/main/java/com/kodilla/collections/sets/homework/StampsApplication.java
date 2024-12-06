package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampCollection = new HashSet<>();

        // Adding stamps to the collection
        stampCollection.add(new Stamp("Chopin", "30x40 mm", true));
        stampCollection.add(new Stamp("Chopin", "30x40 mm", true));
        stampCollection.add(new Stamp("Mozart", "20x30 mm", false));
        stampCollection.add(new Stamp("Mozart", "20x30 mm", false));
        stampCollection.add(new Stamp("Haydn", "50x50 mm", true));
        stampCollection.add(new Stamp("Haydn", "50x50 mm", true));

        // Displaying the collection
        System.out.println("Stamps collection:");
        for (Stamp stamp : stampCollection) {
            System.out.println(stamp);
        }

        // Displaying the size of the collection
        System.out.println("Number of unique stamps: " + stampCollection.size());
    }
}