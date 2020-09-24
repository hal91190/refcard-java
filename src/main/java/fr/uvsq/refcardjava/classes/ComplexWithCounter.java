package fr.uvsq.refcardjava.classes;

/**
 * La classe <code>ComplexWithCounter</code> est un exemple d'usage de membre de classe.
 *
 * @author hal
 * @version 2020
 */
public class ComplexWithCounter {
  /** Le nomdre de complexe */
  static long complexCounter = 0L;
  /** La partie réelle du nombre. */
  private final double real;
  /** La partie imaginaire du nombre. */
  private final double imaginary;

  /**
   * Construit un complexe à partir d'une partie réelle et imaginaire.
   * @param real      la partie réelle
   * @param imaginary la partie imaginaire
   */
  public ComplexWithCounter(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
    complexCounter++;
  }

  /**
   * Retourne le nombre de complexes
   * @return le nombre d'instances
   */
  public static long getComplexCounter() {
    return complexCounter;
  }

  /**
   * Décrémente le compteur quand l'objet est détruit.
   */
  @Override
  protected void finalize() throws Throwable {
    --complexCounter;
    super.finalize();
  }

  /**
   * Retourne la partie réelle.
   * @return la partie réelle
   */
  public double getReal() {
    return real;
  }

  /**
   * Retourne la partie imaginaire.
   * @return la partie imaginaire
   */
  public double getImaginary() {
    return imaginary;
  }
}
