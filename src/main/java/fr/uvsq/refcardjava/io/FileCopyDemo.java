package fr.uvsq.refcardjava.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Présente divers exemples de copie de fichiers.
 * @see https://docs.oracle.com/javase/tutorial/essential/io/file.html
 */
class FileCopyDemo {
    /**
     * Représente la fin d'un flux.
     * Les méthodes <code>read</code> des flux retournent
     * -1 quand la fin du flux est atteint.
     */
    public static final int END_OF_STREAM = -1;

    public static final int IO_ERROR = -1;

    public static void main(String[] args) {
        try {
            DummyFile inFile = new DummyFile(50);

            String inFilename = inFile.toString();

            textFileCopy(inFilename, new DummyFile().toString());
            binaryFileCopy(inFilename, new DummyFile().toString());
            bufferedTextFileCopy(inFilename, new DummyFile().toString());
            simpleTextFileCopy(inFilename, new DummyFile().toString());
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(IO_ERROR);
        }
    }

    // tag::textFileCopy[]
    /**
     * Copie un fichier caractère par caractère.
     */
    private static void textFileCopy(String inFilename, String outFilename) throws IOException {
        try (
                FileReader in = new FileReader(inFilename);
                FileWriter out = new FileWriter(outFilename)
        ) {
            int c;
            while ((c = in.read()) != END_OF_STREAM) {
                out.write(c);
            }
        }
    }
    // end::textFileCopy[]

    // tag::bufferedTextFileCopy[]
    /**
     * Copie un fichier en utilisant un buffer.
     */
    private static void bufferedTextFileCopy(String inFilename, String outFilename) throws IOException {
        Path inPath = Paths.get(inFilename);
        Path outPath = Paths.get(outFilename);
        try (
                BufferedReader in = Files.newBufferedReader(inPath);
                BufferedWriter out = Files.newBufferedWriter(outPath)
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
        }
    }
    // end::bufferedTextFileCopy[]

    // tag::simpleTextFileCopy[]
    /**
     * Copie un fichier texte.
     * Le fichier doit être de taille raisonnable car il est chargé en totalité en mémoire.
     */
    private static void simpleTextFileCopy(String inFilename, String outFilename) throws IOException {
        Path inPath = Paths.get(inFilename);
        Path outPath = Paths.get(outFilename);
        List<String> lines = Files.readAllLines(inPath);
        Files.write(outPath, lines);
    }
    // end::simpleTextFileCopy[]

    // tag::binaryFileCopy[]
    /**
     * Copie un fichier octet par octet.
     */
    private static void binaryFileCopy(String inFilename, String outFilename) throws IOException {
        try (
                FileInputStream in = new FileInputStream(inFilename);
                FileOutputStream out = new FileOutputStream(outFilename)
        ) {
            int c;
            while ((c = in.read()) != END_OF_STREAM) {
                out.write(c);
            }
        }
    }
    // end::binaryFileCopy[]

}