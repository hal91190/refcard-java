package fr.uvsq.refcardjava.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HistogrammeDemo {
    public static void main(String[] args) {
        // tag::histo[]
        int[][] image = {
                {0, 1, 12, 1},
                {1, 12, 12, 12},
                {0, 12, 12, 0}
        };

        Map<Integer, Long> histogramme = frequency(image);
        System.out.println(histogramme); // {0=3, 1=3, 12=6}
        System.out.println(histogramme.keySet()); // [0, 1, 12]

        Optional<Long> max = histogramme.values().stream()
                .max(Comparator.naturalOrder());
        System.out.format("Fréq. max. : %d%n", max.orElse(-1L)); // Fréq. max. : 6
        // end::histo[]
    }

    // tag::frequency[]
    /**
     * Produit l'histogramme d'une image.
     *
     * @param img l'image à analyser
     * @return l'histogramme de l'image sous la forme d'un dictionnaire (couleur, fréquence)
     */
    public static Map<Integer, Long> frequency(int[][] img) {
        Stream<Integer> imgColors = Arrays.stream(img)
                .flatMap(c -> Arrays.stream(c).boxed());
        Map<Integer, Long> frequencyMap = imgColors.collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
        return frequencyMap;
    }
    // end::frequency[]
}
