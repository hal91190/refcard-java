package fr.uvsq.refcardjava.inheritance;

import java.awt.geom.Point2D;

/**
 * Un cercle en deux dimensions.
 *
 * @author Stéphane Lopes
 * @version jan. 2017
 */
class Cercle2D extends FigureFermee2D {
    /**
     * Le centre du cercle.
     */
    private final Point2D.Double centre;

    /**
     * Le rayon du cercle
     */
    private final double rayon;

    /**
     * Initialise un cercle avec un centre et un rayon.
     *
     * @param centre Le centre.
     * @param rayon  Le rayon.
     */
    public Cercle2D(Point2D.Double centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    /**
     * Initialise un cercle centré à l'origine et de rayon 1
     */
    public Cercle2D() {
        this(new Point2D.Double(), 1.0);
    }

    /**
     * Renvoie le centre du cercle.
     *
     * @return le centre du cercle.
     */
    public Point2D getCentre() {
        return centre;
    }

    /**
     * Renvoie le rayon du cercle.
     *
     * @return le rayon du cercle.
     */
    public double getRayon() {
        return rayon;
    }

    // tag::cercle-translate[]
    /**
     * Translate le cercle.
     *
     * @param dx déplacement en abscisse.
     * @param dy déplacement en ordonnées.
     */
    @Override
    public void translate(double dx, double dy) {
        centre.setLocation(centre.getX() + dx, centre.getY() + dy);
    }
    // end::cercle-translate[]

    /**
     * Retourne une chaîne décrivant le cercle.
     *
     * @return la représentation textuelle du cercle.
     */
    public String toString() {
        return String.format("[%s, %f]", centre, rayon);
    }
}
