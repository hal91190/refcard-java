package fr.uvsq.refcardjava.io;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] students = {
                new Student(1, "Ariane"),
                new Student(2, "Cassiopée"),
                new Student(3, "Hélios")
        };

        DummyFile objectStore = new DummyFile();

        writeObjectsToFile(students, objectStore.toString());

        Student[] readStudents = readObjectsFromFile(objectStore.toString());

        System.out.println(Arrays.toString(readStudents));
    }

    // tag::writeObjectsToFile[]
    private static void writeObjectsToFile(Student[] students, String filename) throws IOException {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(filename))
        ) {
            oos.writeObject(LocalDate.now());
            oos.writeObject(students);
        }
    }
    // end::writeObjectsToFile[]

    // tag::readObjectsFromFile[]
    private static Student[] readObjectsFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream(filename))
        ) {
            LocalDate date = (LocalDate) ois.readObject();
            return (Student[]) ois.readObject();
        }
    }
    // end::readObjectsFromFile[]
}
