package fr.uvsq.refcardjava.collections;

import java.util.Comparator;

/**
 * Permet de comparer des personnes selon leur âge.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
class ByAgeComparator implements Comparator<Person> {
    /**
     * Compare deux personnes selon leur âge.
     *
     * @return l'écart d'age entre les deux personnes.
     */
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
