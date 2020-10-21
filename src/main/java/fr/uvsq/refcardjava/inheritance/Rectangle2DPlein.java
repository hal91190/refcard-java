package fr.uvsq.refcardjava.inheritance;


import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Un rectangle plein en deux dimensions.
 *
 * @author Stéphane Lopes
 * @version nov. 2008
 */
class Rectangle2DPlein extends Rectangle2D { //<1>
    /**
     * La couleur de remplissage
     */
    private final Color couleur; //<2>

    /**
     * Initialise le rectangle plein.
     *
     * @param supGauche Le coin supérieur gauche.
     * @param infDroit  Le coin inférieur droit.
     * @param couleur   La couleur de remplissage.
     */
    public Rectangle2DPlein(Point2D.Double supGauche,
                            Point2D.Double infDroit,
                            Color couleur) {
        super(supGauche, infDroit); //<3>
        assert couleur != null;
        this.couleur = couleur;
    }

    /**
     * Renvoie la couleur.
     *
     * @return la couleur.
     */
    public Color getCouleur() {
        return couleur;
    } //<4>

    // tag::rect-plein-tostring[]
    /**
     * Retourn une chaîne représentant l'objet.
     *
     * @return la chaîne.
     */
    @Override
    public String toString() {
        return String.format("%s, couleur : %s", super.toString(), couleur);
    }
    // end::rect-plein-tostring[]
}
