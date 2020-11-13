package fr.uvsq.refcardjava.io;

import java.io.Serializable;

public class Student implements Serializable {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student{number: %d, name: '%s'}", number, name);
    }
}
