package fr.uvsq.refcardjava.errors;

/**
 * Exception pour la pile vide.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
class PileVideException extends PileException {
    /**
     * Initialise une instance de <code>PileVideException</code>.
     */
    public PileVideException() {
        super("La Pile est vide");
    }
}
