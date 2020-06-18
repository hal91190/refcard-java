package fr.uvsq.refcardjava.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest {
  @Test
  public void variableDeclarationAndInitialization() {
    // tag::base-var-decl[]
    byte aByte = 12;            // Un entier sur 8 bits
    short aShort = 130;         // Un entier sur 16 bits
    int anInteger = -153456;    // Un entier sur 32 bits

    // Remarquer le L pour le litteral de type long
    // (sinon erreur a la compilation: entier trop grand)
    long aLong = 987654321234L; // Un entier sur 64 bits

    // Remarquer le F pour le litteral de type float
    // (sinon erreur a la compilation: perte de precision)
    float aFloat = 1.3F;        // Un reel simple precision
    double aDouble = -1.5E-4;   // Un reel double precision

    char aChar = 'S';           // Un caractere
    boolean aBoolean = true;    // Un booleen

    // La constante est introduite par le mot-cle final
    final int zero = 0;       // Une constante
    // end::base-var-decl[]

    assertEquals(12, aByte);
    assertEquals(130, aShort);
    assertEquals(-153456, anInteger);
    assertEquals(987654321234L, aLong);
    assertEquals(1.3F, aFloat);
    assertEquals(-1.5E-4, aDouble);
    assertEquals('S', aChar);
    assertTrue(aBoolean);
    assertEquals(0, zero);
  }
}
