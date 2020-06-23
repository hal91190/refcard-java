package fr.uvsq.refcardjava.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
  @Test
  public void arraysDeclarationsAndManipulations() {
    // tag::base-arrays[]
    int[] arrayOfFiveZeros = { 0, 0, 0, 0, 0};
    int[] anArray = new int[5];
    assertArrayEquals(arrayOfFiveZeros, anArray);
    assertNotSame(arrayOfFiveZeros, anArray); //<1>

    int[] theSameArray = anArray;
    assertSame(anArray, theSameArray); //<2>

    theSameArray[0] = 12;
    assertEquals(12, anArray[0]);
    assertEquals(12, theSameArray[0]); //<3>

    int[] anotherArray = new int[5];
    assertArrayEquals(arrayOfFiveZeros, anotherArray);
    assertNotSame(arrayOfFiveZeros, anotherArray); //<4>

    theSameArray = anotherArray;
    assertSame(anotherArray, theSameArray);
    assertNotSame(anArray, theSameArray); //<5>

    theSameArray[0] = 21;
    assertEquals(12, anArray[0]);
    assertEquals(21, theSameArray[0]);
    assertEquals(21, anotherArray[0]); //<6>
    // end::base-arrays[]
  }
}
