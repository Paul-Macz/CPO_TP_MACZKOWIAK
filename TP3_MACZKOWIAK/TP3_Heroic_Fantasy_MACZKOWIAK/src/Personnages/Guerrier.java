/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lukha
 */
public class Guerrier extends Personnage {

    boolean onhorse;
    static int nbGuerrier;
    int Basedamage;
    

    public Guerrier(boolean onhorse, String nom, int hp) {
        super(nom, hp, "Armes.Epee");
        ++nbGuerrier;
        this.onhorse = onhorse;
    }
    
    public void setOnhorse(boolean onhorse) {
        this.onhorse = onhorse;
    }
    
    public void finalize(){
        nbGuerrier--;
        
    }

    public static int getNbGuerrier() {
        return nbGuerrier;
    }
    

}
