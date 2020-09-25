package fr.uvsq.refcardjava.inheritance;

import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle2DTest {
  @Test
  public void testClone() throws CloneNotSupportedException {
    Rectangle2D r = new Rectangle2D(new Point2D.Double(0.0, 5.0),
      new Point2D.Double(2.0, 2.0));
    Rectangle2D copie = (Rectangle2D) r.clone();
    assertNotSame(copie, r); // Pas identiques
    assertEquals(r.getClass(), copie.getClass()); // Même classe
    assertEquals(copie, r); // Egaux
  }

  @Test
  public void testEquals() {
    // tag::rect-plein-use-4[]
    Rectangle2D r1 = new Rectangle2D(new Point2D.Double(0.0, 5.0),
      new Point2D.Double(2.0, 2.0));
    Rectangle2D r2 = new Rectangle2D(new Point2D.Double(0.0, 5.0),
      new Point2D.Double(2.0, 2.0));
    Rectangle2D r3 = new Rectangle2D(new Point2D.Double(0.0, 5.0),
      new Point2D.Double(2.0, 2.0));
    assertEquals(r1, r1);    // Réflexivité
    assertEquals(r1, r2);
    assertEquals(r2, r1); // Symétrie
    // r1.equals(r2) && r2.equals(r3) =>
    assertEquals(r1, r3); // Transitivité
    assertNotNull(r1);
    assertEquals(r1.hashCode(), r2.hashCode());
    // end::rect-plein-use-4[]
  }
}