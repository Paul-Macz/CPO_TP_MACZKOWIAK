/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP3 Exercice 1
* Date: 18/10/23
 */
package Armes;

/**
 *
 * @author lukha
 */
public abstract class Arme {

    private String nom;
    private int atk;
    static int nbArmes;

    public Arme(String name, int atklvl) {
        ++nbArmes;
        this.nom = name;
        if (atklvl > 100) {
            this.atk = 100;
        }
        if (atklvl < 0) {
            this.atk = 0;
        } else {
            this.atk = atklvl;
        }
    }

    public String getNom() {
        return nom;
    }

    public int getAtk() {
        return atk;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", atk=" + atk + '}';
    }

}
