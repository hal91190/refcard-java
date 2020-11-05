package fr.uvsq.refcardjava.inheritance;

import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

class FigureFermee2DTest {
  @Test
  public void abstractClassDemo() {
    // tag::abstract-class-demo[]
    // Création du tableau de références
    final int NB_FIGURES = 4;
    FigureFermee2D[] figure = new FigureFermee2D[NB_FIGURES];

    // Création des formes
    figure[0] = new Rectangle2D(new Point2D.Double(0.0, 5.0), new Point2D.Double(2.0, 2.0));
    figure[1] = new Cercle2D(new Point2D.Double(1.0, 2.0), 3.0);
    figure[2] = new Rectangle2D(new Point2D.Double(5.0, 5.0), new Point2D.Double(7.0, 3.0));
    figure[3] = new Cercle2D(new Point2D.Double(4.0, 5.0), 2.0);

    // Réalise une translation de la figure
    for (FigureFermee2D figureFermee2D : figure) {
      figureFermee2D.translate(1.0, 2.0);
    }
    // end::abstract-class-demo[]
    //TODO Comment vérifier le bon fonctionnement du déplacement ?
  }
}