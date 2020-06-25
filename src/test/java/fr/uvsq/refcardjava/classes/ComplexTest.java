package fr.uvsq.refcardjava.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplexTest {
  @Test
  public void shouldCreateAComplexNumber() {
    var c = new Complex(1.0, 2.0); // 1 + 2i
    assertEquals(1.0, c.getReal());
    assertEquals(2.0, c.getImaginary());
  }

  @Test
  public void shouldCreateAComplexNumberFromARealNumber() {
    var c = new Complex(1.0); // 1 + 0i
    assertEquals(1.0, c.getReal());
    assertEquals(0.0, c.getImaginary());
  }

  @Test
  public void shouldAddTwoComplex() {
    var c1 = new Complex(1.0, 2.0); // 1 + 2i
    var c2 = new Complex(2.0, 3.0); // 2 + 3i
    var result = c1.add(c2);
    assertEquals(3.0, result.getReal());
    assertEquals(5.0, result.getImaginary());
  }

  @Test
  public void shouldAddAComplexWithNull() {
    var c1 = new Complex(1.0, 2.0); // 1 + 2i
    Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.add(null));
    assertEquals("Parameter can not be null.", exception.getMessage());
  }
}
