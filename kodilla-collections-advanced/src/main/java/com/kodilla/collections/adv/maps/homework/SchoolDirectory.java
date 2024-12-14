package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<String, School> schoolDirectory = new HashMap<>();

        schoolDirectory.put("Adam Smith", new School("Primary School No. 1", List.of(25, 30, 28)));
        schoolDirectory.put("Katherine Jones", new School("Primary School No. 2", List.of(20, 22, 26, 30)));
        schoolDirectory.put("Anne Martin", new School("Primary School No. 3", List.of(15, 18, 24, 27, 30)));

        // Using the forEach method for a map
        schoolDirectory.forEach((principal, school) ->
                System.out.println("Director: " + principal + ", School: " + school.getName() +
                        ", Total number of students: " + school.getTotalStudents())
        );
    }
}