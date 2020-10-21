package fr.uvsq.refcardjava.inheritance;

import java.awt.geom.Point2D;

/**
 * Un rectangle en deux dimensions.
 * Les côtés du rectangle sont toujours parallèles aux axes.
 *
 * @version  jan. 2017
 * @author   Stéphane Lopes
 * 
 */
class Rectangle2D implements Cloneable {
    /** Coordonnées du coin supérieur gauche */
    private Point2D.Double orig;

    /** Coordonnées du coin inférieur droit */
    private Point2D.Double fin;

    /**
     * Initialise le rectangle.
     * @param supGauche Le coin supérieur gauche.
     * @param infDroit Le coin inférieur droit.
     */
    public Rectangle2D(Point2D.Double supGauche, Point2D.Double infDroit) {
        assert supGauche.getX() <= infDroit.getX() &&
               supGauche.getY() >= infDroit.getY();
        orig = supGauche;
        fin = infDroit;
    }

    public Point2D.Double getSupGauche() { return orig; }

    public double getLargeur() {
        return fin.getX() - orig.getX();
    }

    public double getHauteur() {
        return orig.getY() - fin.getY();
    }

    // tag::rect-tostring[]
    /**
     * Retourne une chaîne représentant l'objet.
     * @return la chaîne.
     */
    @Override
    public String toString() {
        return String.format("O = %s L = %s, H = %s", orig, getLargeur(), getHauteur());
    }
    // end::rect-tostring[]

    /**
     * Retourne une copie "profonde" de l'objet.
     * @return la copie.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle2D r = (Rectangle2D)super.clone();
        r.orig = new Point2D.Double(orig.getX(), orig.getY());
        r.fin = new Point2D.Double(fin.getX(), fin.getY());
        return r;
    }

    // tag::rect-equals[]
    /**
     * Teste l'égalité de deux rectangles.
     * @param obj le rectangle à comparer.
     * @return true si les objets sont égaux.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle2D) {
            Rectangle2D r = (Rectangle2D)obj;
            return orig.equals(r.orig) && fin.equals(r.fin);
        }
        return false;
    }

    /**
     * Retourne une valeur de hashage pour l'objet.
     * @return la valeur de hashage.
     */
    @Override
    public int hashCode() {
        return orig.hashCode() ^ fin.hashCode();
    }
    // end::rect-equals[]

    /**
     * Translate le rectangle.
     * @param dx déplacement en abscisse.
     * @param dy déplacement en ordonnées.
     */
    public void translate(double dx, double dy) {
        orig.setLocation(orig.getX() + dx, orig.getY() + dy);
        fin.setLocation(fin.getX() + dx, fin.getY() + dy);
    }
}
