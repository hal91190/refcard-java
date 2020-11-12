package fr.uvsq.refcardjava.errors;

/**
 * Exception pour la pile pleine.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
class PilePleineException extends PileException {
    /**
     * Initialise une instance de <code>PilePleineException</code>.
     */
    public PilePleineException() {
        super("La Pile est pleine");
    }
}
