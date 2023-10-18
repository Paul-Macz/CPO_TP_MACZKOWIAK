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
public class Baton extends Arme {

    private int age;

    public Baton(int age, String name, int atklvl) {
        super(name, atklvl);
        if (age < 0) {
            this.age = 0;
        }
        if (age >= 100) {
            age = 99;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
    
}
