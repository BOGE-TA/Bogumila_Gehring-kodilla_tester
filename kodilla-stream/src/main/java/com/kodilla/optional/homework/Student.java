package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {  // DODANA METODA GETTERA
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getTeacherName() {
        return Optional.ofNullable(teacher)
                .map(Teacher::getName)
                .orElse("<undefined>");
    }
}


