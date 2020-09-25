package fr.uvsq.refcardjava.inheritance;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Rectangle2DPleinTest {
  @Test
  public void testConstructeur() {
    // tag::rect-plein-use-1[]
    Rectangle2DPlein rp = new Rectangle2DPlein(new Point2D.Double(1.0, 2.0),
      new Point2D.Double(3.0, 0.0),
      Color.RED);
    assertEquals(Color.RED, rp.getCouleur());

    // Déclaration d'un rectangle et liaison avec un rectangle plein
    Rectangle2D r = new Rectangle2DPlein(new Point2D.Double(1.0, 2.0), //<1>
      new Point2D.Double(2.0, 1.0),
      Color.YELLOW);
    assertEquals(1, r.getLargeur());
    //assertEquals(Color.RED, r.getCouleur()); //<2>
    // end::rect-plein-use-1[]
  }

  @Test
  public void testPolym() {
    // tag::rect-plein-use-2[]
    // Création d'un tableau de références sur des Rectangle2D
    final int NB_RECTANGLES = 2;
    Rectangle2D[] figures = new Rectangle2D[NB_RECTANGLES];

    // Un rectangle
    figures[0] = new Rectangle2D(new Point2D.Double(0.0, 5.0),
      new Point2D.Double(2.0, 2.0));

    // Un rectangle plein
    figures[1] = new Rectangle2DPlein(new Point2D.Double(1.0, 3.0),
      new Point2D.Double(3.0, 2.0),
      Color.BLUE);

    assertEquals("O = Point2D.Double[0.0, 5.0] L = 2.0, H = 3.0", figures[0].toString());
    assertEquals("O = Point2D.Double[1.0, 3.0] L = 2.0, H = 1.0, couleur : java.awt.Color[r=0,g=0,b=255]",
      figures[1].toString());
    // end::rect-plein-use-2[]
  }
}
