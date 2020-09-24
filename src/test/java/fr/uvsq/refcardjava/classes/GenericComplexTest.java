package fr.uvsq.refcardjava.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericComplexTest {
  @Test
  public void shouldCreateAComplexFromFloat() {
    GenericComplex<Float> c = new GenericComplex<>(1.0F, 2.0F);
    assertTrue(c.getReal() instanceof Float);
    assertTrue(c.getImaginary() instanceof Float);
  }

  @Test
  public void shouldCreateAComplexFromDouble() {
    GenericComplex<Double> c = new GenericComplex<>(1.0, 2.0);
    assertTrue(c.getReal() instanceof Double);
    assertTrue(c.getImaginary() instanceof Double);
  }
}
