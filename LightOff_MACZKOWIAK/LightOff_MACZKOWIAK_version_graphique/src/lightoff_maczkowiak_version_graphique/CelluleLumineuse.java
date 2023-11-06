/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* Mini Projet - LightOff
* Date: 25/10/23
 */
package lightoff_maczkowiak_version_graphique;

import java.util.Random;

/**
 *
 * @author lukha
 */
public class CelluleLumineuse {
    public static Random rand = new Random();
    private int etat;

    /*
    * etat est désormais un entier compris entre 0 et 2:
    * 0 est équivalent à l'ancien "false"
    * 1 est équivalent à l'ancien "true"
    * 2 est un etat intermédiaire
     */

    /**
     * Lorsque une cellule est créé, son état vaut par défaut 0
     */
    public CelluleLumineuse() {
        etat = 0;

    }
    
    /**
     * Change l'état d'une cellule
     * Depend du niveau de difficulté:
     * -Facile (1) : l'état oscille entre 0 et 1
     * -Normale(2) ou difficile (3) : l'état prend une valeur aléatoire entre 
     * 0 et 2, en excluant sa précédente valeur
     */
    public void activerCellule() {
        if (Partie.getDifficulty() == 1) {
            if (etat == 0) {
                etat = 1;
            } else {
                etat = 0;
            }
        } else {
            switch (etat) {
                case 0:
                    etat = rand.nextInt(1, 3);
                    break;
                case 2:
                    etat=rand.nextInt(1);
                    break;
                default:
                    while(etat==1){
                        etat=rand.nextInt(3);
                    break;
                    }
            }
        }
    }

    /**
     *
     * @return Retourne l'état de la cellule
     */
    public int getEtat() {
        return etat;
    }
    
    /**
     * Change l'état de la cellule en 0
     */
    public void eteindreCellule() {
        if(etat!=0){
            etat=0;
        }
    }
    
    /**
     * Verifie que l'état de la cellule vaut 0"
     *
     * @return Renvoie "true" si l'état est 0 et "false" sinon
     */
    public boolean estEteint() {
        if (etat != 0) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Convertit l'état de la cellule sous une forme adéquate pour l'interface
     *
     * @return Retourne "X" si son état est 1, "O" si son état est 0, ou "I" si 
     * son état est 2
     */
    @Override
    public String toString() {
        if (this.etat == 1) {
            return "X";
        }
        else if (this.etat==0){
            return "O";
        }
        else{
            return "I";
        }
    }

}
