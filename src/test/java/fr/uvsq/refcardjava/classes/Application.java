package fr.uvsq.refcardjava.classes;

/**
 * La classe <code>Application</code> contient la méthode <code>main</code> du programme.
 * Cette implémentation s'appuie sur le design pattern Singleton.
 *
 * @author hal
 * @version 2020
 */
public enum Application {
  APPLICATION;

  /**
   * Méthode principale du programme.
   * @param args les arguments de ligne de commande
   */
  public void run(String[] args) {
    // ...
  }

  /**
   * Point d'entrée du programme.
   * @param args les arguments de ligne de commande
   */
  public static void main(String[] args) {
    APPLICATION.run(args);
  }
}
