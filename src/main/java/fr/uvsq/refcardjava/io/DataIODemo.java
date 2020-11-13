package fr.uvsq.refcardjava.io;

import java.io.*;
import java.util.Arrays;

public class DataIODemo {
    public static void main(String[] args) throws IOException {
        int numberOfItems = 5;
        double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        int[] units = {12, 8, 13, 29, 50};
        String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"};

        DummyFile file = new DummyFile();
        System.out.format("Writing data to %s%n", file.toString());
        writeDateToFile(file.toString(), numberOfItems, prices, units, descs);

        double[] readPrices = new double[numberOfItems];
        int[] readUnits = new int[numberOfItems];
        String[] readDescs = new String[numberOfItems];
        System.out.format("Reading data from %s%n", file.toString());
        readDateFromFile(file.toString(), numberOfItems, readPrices, readUnits, readDescs);
        System.out.println(Arrays.toString(readPrices));
        System.out.println(Arrays.toString(readUnits));
        System.out.println(Arrays.toString(readDescs));
    }

    // tag::writeDateToFile[]
    public static void writeDateToFile(String filename, int numberOfItems, double[] prices, int[] units, String[] descs) throws IOException {
        try (DataOutputStream out =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream(filename)))
        ) {
            for (int i = 0; i < numberOfItems; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        }
    }
    // end::writeDateToFile[]

    // tag::readDateFromFile[]
    public static void readDateFromFile(String filename, int numberOfItems, double[] prices, int[] units, String[] descs) throws IOException {
        try (DataInputStream out =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(filename)))
        ) {
            for (int i = 0; i < numberOfItems; i++) {
                prices[i] = out.readDouble();
                units[i] = out.readInt();
                descs[i] = out.readUTF();
            }
        }
    }
    // end::readDateFromFile[]
}
