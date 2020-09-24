package fr.uvsq.refcardjava.classes;

/**
 * La classe <code>Complex</code> représente un nombre complexe générique dont le type de la partie entière et imaginaire est paramétré.
 *
 * @author hal
 * @version 2020
 */
public class GenericComplex<T> {
  /** La partie réelle du nombre. */
  private final T real;
  /** La partie imaginaire du nombre. */
  private final T imaginary;

  /**
   * Construit un complexe à partir d'une partie réelle et imaginaire.
   * @param real      la partie réelle
   * @param imaginary la partie imaginaire
   */
  public GenericComplex(T real, T imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  /**
   * Retourne la partie réelle.
   * @return la partie réelle
   */
  public T getReal() {
    return real;
  }

  /**
   * Retourne la partie imaginaire.
   * @return la partie imaginaire
   */
  public T getImaginary() {
    return imaginary;
  }
}
