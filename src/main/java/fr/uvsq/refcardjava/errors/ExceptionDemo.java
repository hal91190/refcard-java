package fr.uvsq.refcardjava.errors;

/**
 * Application de démonstration pour les exceptions.
 *
 * @author Stéphane Lopes
 * @version fév. 2017
 */
enum ExceptionDemo {
    ENVIRONNEMENT;

    /*
     * Méthode principale du programme.
     *
     * @param args les paramètres de ligne de commande.
     */
    public void run(String[] args) {
        // tag::exceptions[]
        try { //<1>
            Pile unePile = new Pile(2);
            unePile.empile("azerty");
            unePile.empile("qsdfgh");
            unePile.empile("wxcvbn");
            assert false : "Jamais atteint";
            String str = (String) unePile.depile();
        } catch (PileVideException e) { //<2>
            assert e.getMessage().equals("La Pile est vide");
        } catch (PileException e) { //<3>
            assert e.getMessage().equals("La Pile est pleine");
        }
        // end::exceptions[]

    }

    public static void main(String[] args) {
        ENVIRONNEMENT.run(args);
    }
}