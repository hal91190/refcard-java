package fr.uvsq.refcardjava.io;

import java.util.*;
import java.io.*;

public class StdIODemo {
    public static void main(String[] args) throws IOException {
        stdIoWithBufferedReader();
        stdIoWithScanner();
    }

    private static void stdIoWithScanner() {
        // tag::stdIoWithScanner[]
        System.out.println("Votre nom et votre âge ? ");

        Scanner s = new Scanner(System.in);
        String nom = s.next();
        int age = s.nextInt();

        System.out.format("Votre nom est %s et vous avez %5d ans.%n", nom, age);
        // end::stdIoWithScanner[]
    }

    private static void stdIoWithBufferedReader() throws IOException {
        // tag::stdIoWithBufferedReader[]
        System.out.println("Votre nom et votre age ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nom = in.readLine();
        int age = Integer.parseInt(in.readLine());

        System.out.format("Votre nom est %s et vous avez %5d ans.%n", nom, age);
        // end::stdIoWithBufferedReader[]
    }
}
