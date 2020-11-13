package fr.uvsq.refcardjava.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.stream.Collectors;

public class DummyFile {
    private static final String PREFIX = "DummyFile";
    private static final String SUFFIX = ".txt";
    private static final String DELIMITER = "; ";
    private static final int LINE_MIN_SIZE = 5;
    private static final int LINE_RANDOM_BOUND = 10;

    private final Path location;

    /**
     * Crée un fichier vide.
     * @throws IOException si la création du fichier temporaire échoue
     */
    public DummyFile() throws IOException {
        location = Files.createTempFile(PREFIX, SUFFIX);
    }

    /**
     * Crée un fichier contenant numberOfLines lignes d'entiers.
     * @param numberOfLines nombre de lignes à générer
     * @throws IOException si l'ouverture du fichier échoue
     */
    public DummyFile(int numberOfLines) throws IOException {
        this();
        try(BufferedWriter dummyFile = Files.newBufferedWriter(location)) {
            Random generator = new Random();
            for (int i = 0; i < numberOfLines; ++i) {
                int sizeOfLine = LINE_MIN_SIZE + generator.nextInt(LINE_RANDOM_BOUND);
                String line = generator.ints(sizeOfLine)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(DELIMITER));
                dummyFile.write(line);
                dummyFile.newLine();
            }
        }
    }

    @Override
    public String toString() {
        return location.toString();
    }
}
