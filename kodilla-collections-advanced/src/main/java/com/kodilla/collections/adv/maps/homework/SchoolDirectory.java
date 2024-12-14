package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.homework.School;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// SchoolDirectory class with main method
public class SchoolDirectory {
    public static void main(String[] args) {
        // Creating a map assigning schools to principals.
        Map<Principal, School> schoolDirectory = new HashMap<>();

        // Create data on schools and principals
        Principal principal1 = new Principal() {
            @Override
            public boolean equals(Object another) {
                return false;
            }

            @Override
            public String toString() {
                return "";
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getName() {
                return "";
            }
        };
        School school1 = new School("Primary School No. 1", List.of(25, 30, 28));

        Principal principal2 = new Principal() {
            @Override
            public boolean equals(Object another) {
                return false;
            }

            @Override
            public String toString() {
                return "";
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getName() {
                return "";
            }
        };
        School school2 = new School("Primary School No. 2", List.of(20, 22, 26, 30));

        Principal principal3 = new Principal() {
            @Override
            public boolean equals(Object another) {
                return false;
            }

            @Override
            public String toString() {
                return "";
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getName() {
                return "";
            }
        };
        School school3 = new School("Primary School No. 3", List.of(15, 18, 24, 27, 30));

        // Adding data to the map
        schoolDirectory.put(principal1, school1);
        schoolDirectory.put(principal2, school2);
        schoolDirectory.put(principal3, school3);

        // Using a for-each loop to display information
        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            System.out.println("Director: " + principal.getName() + ", School: " + school.getName() +
                    ", Total number of students: " + school.getTotalStudents());
        }
    }
}