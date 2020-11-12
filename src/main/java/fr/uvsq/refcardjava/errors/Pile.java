package fr.uvsq.refcardjava.errors;

/**
 * Représente une pile.
 * La taille de la pile est précisée lors de la création
 * et ne peut pas être modifiée par la suite.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
public class Pile {
    /**
     * Les éléments de la pile
     */
    private final Object[] contenu;

    /**
     * Marque le premier élément libre de la pile
     */
    private int sommet;

    /**
     * Crée une pile de la taille spécifiée.
     *
     * @param taille la taille de la pile
     */
    public Pile(int taille) {
        contenu = new Object[taille];
    }

    // tag::throw[]
    // tag::throws-pile-pleine[]
    /**
     * Empile un élément au sommet de la pile.
     *
     * @param unObjet l'objet à empiler
     * @throws PilePleineException s'il n'y a plus de place
     */
    public void empile(Object unObjet) throws PilePleineException {
        // end::throws-pile-pleine[]
        if (sommet == contenu.length) {
            throw new PilePleineException();
        }
        contenu[sommet++] = unObjet;
    }

    // tag::throws-pile-vide[]
    /**
     * Dépile l'élément se trouvant au sommet de la pile.
     *
     * @return l'élément au sommet
     * @throws PileVideException s'il n'y a pas d'élément
     */
    public Object depile() throws PileVideException {
        // end::throws-pile-vide[]
        if (sommet == 0) {
            throw new PileVideException();
        }
        return contenu[--sommet];
    }
    // end::throw[]
}
