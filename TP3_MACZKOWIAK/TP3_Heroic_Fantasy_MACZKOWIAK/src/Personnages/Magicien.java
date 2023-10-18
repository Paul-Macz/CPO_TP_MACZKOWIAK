/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lukha
 */
public class Magicien extends Personnage {

    boolean confirmed;
    static int nbMage;
    

    public Magicien(boolean confirmed, String nom, int hp) {
        super(nom, hp, "Armes.Baton");
        ++nbMage;
        this.confirmed = confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void finalize(){
        nbMage--;
    }

    public static int getNbMage() {
        return nbMage;
    }

}
