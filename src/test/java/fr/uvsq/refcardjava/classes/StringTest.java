package fr.uvsq.refcardjava.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
  @Test
  public void stringDeclarations() {
    // tag::class-string-decl[]
    String s1 = new String();
    assertEquals("", s1);

    char[] abc = {'a', 'b', 'c'};
    String s2 = new String(abc);
    assertEquals("abc", s2);
    assertNotSame("abc", s2);

    String s3 = "xyz";
    assertEquals("xyz", s3);

    String s4 = s2;
    assertEquals(s2, s4);
    assertSame(s2, s4);
    // end::class-string-decl[]
  }

  @Test
  public void stringManipulations() {
    String s2 = new String("abc");

    // tag::class-string-manip[]
    assertEquals(3, s2.length());
    assertEquals("b", s2.substring(1, 2));
    // end::class-string-manip[]
  }

  @Test
  public void stringReverseAndCopy() {
    // tag::class-string-exemple[]
    String source = "abcde";
    int sourceLength = source.length();
    StringBuilder destination = new StringBuilder(sourceLength);

    for (int i = (sourceLength - 1); i >= 0; --i) {
      destination.append(source.charAt(i));
    }
    assertEquals("edcba", destination.toString());
    // end::class-string-exemple[]
  }
}
