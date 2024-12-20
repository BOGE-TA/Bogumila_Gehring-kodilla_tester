package com.kodilla.optional.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Marc Darcy", new Teacher("Matthew Blue")),
                new Student("Kevin McQuinn", null),
                new Student("Peter Law", new Teacher("Anne Windsor")),
                new Student("Rebeca Perry", null)
        );

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
    }
}
