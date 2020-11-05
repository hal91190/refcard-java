package fr.uvsq.refcardjava.inheritance;

/**
 * Une figure fermée.
 *
 * @version  jan. 2017
 * @author   Stéphane Lopes
 * 
 */
abstract class FigureFermee2D {
    /**
     * Translate la figure.
     * @param dx déplacement en abscisse.
     * @param dy déplacement en ordonnée.
     */
    public abstract void translate(double dx, double dy);
}
