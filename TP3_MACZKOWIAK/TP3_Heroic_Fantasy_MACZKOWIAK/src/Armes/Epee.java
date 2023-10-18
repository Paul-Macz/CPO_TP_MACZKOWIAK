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
public class Epee extends Arme {

    private int finesse;

    public Epee(int finesse, String name, int atklvl) {
        super(name, atklvl);
        if (finesse >= 100) {
            this.finesse = 99;
        }
        if (finesse < 0) {
            this.finesse = 0;
        } else {
            this.finesse = finesse;
        }
    }

    public int getFinesse() {
        return finesse;
    }
    
}
