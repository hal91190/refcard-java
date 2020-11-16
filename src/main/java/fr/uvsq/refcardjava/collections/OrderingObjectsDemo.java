package fr.uvsq.refcardjava.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Application de test pour la comparaison d'objets.
 *
 * @author Stéphane lopes
 * @version fév. 2017
 */
public class OrderingObjectsDemo {
    public static void main(String[] args) {
        // tag::orderingdemo[]
        List<Person> lst = Arrays.asList(
                new Person("Ariane", "Dupond", 9),
                new Person("Cassiopée", "Dupond", 8),
                new Person("Hélios", "Martin", 4)
        );

        Collections.sort(lst); // tri selon l'ordre naturel
        System.out.println(lst);

        Collections.sort(lst, new ByAgeComparator()); // peut être remplacé par
        lst.sort((p1, p2) -> p1.getAge() - p2.getAge()); // peut être remplacé par
        lst.sort(Comparator.comparing(Person::getAge)); // tri selon l'âge
        System.out.println(lst);
        // end::orderingdemo[]
    }
}
