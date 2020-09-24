package fr.uvsq.refcardjava.classes;

/**
 * La classe <code>Complex</code> représente un nombre complexe.
 *
 * @author hal
 * @version 2020
 */
public class Complex {
  /** La partie réelle du nombre. */
  private final double real;
  /** La partie imaginaire du nombre. */
  private final double imaginary;

  /**
   * Construit un complexe à partir d'une partie réelle et imaginaire.
   * @param real      la partie réelle
   * @param imaginary la partie imaginaire
   */
  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  /**
   * Construit un complexe uniquement à partir d'une partie réelle.
   * La partie imaginaire sera égale à zéro.
   *
   * @param real      la partie réelle
   */
  public Complex(double real) {
    this(real, 0.0);
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

  /**
   * Retourne un nouveau nombre complexe, somme du nombre courant et du paramètre.
   *
   * @param rhs le nombre complexe en partie droite de l'opération
   * @return la somme de l'objet courant et de rhs
   */
  public Complex add(Complex rhs) {
    if (rhs == null) throw new IllegalArgumentException("Parameter can not be null.");
    return new Complex(real + rhs.real, imaginary + rhs.imaginary);
  }
}
