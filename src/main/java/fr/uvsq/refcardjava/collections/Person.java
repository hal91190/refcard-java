package fr.uvsq.refcardjava.collections;

/**
 * Implémente une personne.
 *
 * @author Stéphane lopes
 * @version fév. 2017
 */
// tag::person[]
class Person implements Comparable<Person> {
// end::person[]
    /**
     * Le prénom de la personne
     */
    private final String prenom;

    /**
     * Le nom de la personne
     */
    private final String nom;

    /**
     * L'âge de la personne
     */
    private final int age;

    public Person(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s an(s)", nom, prenom, age);
    }

    // tag::compareto[]
    /**
     * Compare deux personnes.
     * La comparaison se fait d'abord selon l'ordre
     * lexicographique du nom puis selon le prénom.
     *
     * @param p une personne
     * @return la valeur de comparaison entre les chaînes représentant les noms
     * ou entre les prénoms si les noms sont égaux.
     */
    @Override
    public int compareTo(Person p) {
        int cmpNom = nom.compareTo(p.nom);
        return (cmpNom != 0 ? cmpNom : prenom.compareTo(p.prenom));
    }
    // end::compareto[]
}
