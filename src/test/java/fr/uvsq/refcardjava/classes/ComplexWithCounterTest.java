package fr.uvsq.refcardjava.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexWithCounterTest {
  @BeforeEach
  public void setup() {
    ComplexWithCounter.resetComplexCounter();
  }

  @Test
  public void shouldHaveNoInstances() {
    assertEquals(0, ComplexWithCounter.getComplexCounter());
  }

  @Test
  public void shouldHaveThreeInstances() {
    var c1 = new ComplexWithCounter(0.0, 0.0);
    var c2 = new ComplexWithCounter(1.0, 1.0);
    var c3 = new ComplexWithCounter(2.0, 2.0);

    assertEquals(3, ComplexWithCounter.getComplexCounter());
  }

  @Test
  public void shouldHaveAlsoThreeInstances() {
    var c1 = new ComplexWithCounter(0.0, 0.0);
    var c2 = new ComplexWithCounter(1.0, 1.0);
    var c3 = new ComplexWithCounter(2.0, 2.0);
    var c4 = c3;

    assertEquals(3, ComplexWithCounter.getComplexCounter());
  }

  @Disabled
  @Test
  public void shouldHaveTwoInstances() throws InterruptedException {
    var c1 = new ComplexWithCounter(0.0, 0.0);
    var c2 = new ComplexWithCounter(1.0, 1.0);
    var c3 = new ComplexWithCounter(2.0, 2.0);

    assertEquals(3, ComplexWithCounter.getComplexCounter());

    c1 = null;
    System.gc();
    Thread.sleep(1000);

    assertEquals(2, ComplexWithCounter.getComplexCounter());
  }
}
