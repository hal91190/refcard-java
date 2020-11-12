package fr.uvsq.refcardjava.errors;

/**
 * La racine de la hiérarchie d'exception pour la pile.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
class PileException extends Exception {
    /**
     * Initialise une instance de <code>PileException</code>.
     *
     * @param message le message d'erreur.
     */
    public PileException(String message) {
        super(message);
    }
}
