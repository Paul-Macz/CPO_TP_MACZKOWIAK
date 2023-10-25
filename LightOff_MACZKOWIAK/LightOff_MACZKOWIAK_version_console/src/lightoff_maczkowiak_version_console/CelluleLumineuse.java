/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* Mini Projet - LightOff
* Date: 25/10/23
 */
package lightoff_maczkowiak_version_console;

/**
 *
 * @author lukha
 */
public class CelluleLumineuse {

    private boolean etat;

    /**
     * Lorsque une cellule est créé, son état vaut par défaut "false"
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * Change l'état d'une cellule
     */
    public void activerCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = true;
        }
    }

    /**
     * Change l'état de la cellule en false
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
    }

    /**
     * Verifie que l'état de la cellule vaut "false"
     *
     * @return Renvoie "true" si l'état est "false" et "false" si l'état est
     * "true"
     */
    public boolean estEteint() {
        if (etat == true) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @return Retourne l'état actuel de la cellule
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Convertit l'état de la cellule sous une forme adéquate pour l'interface
     *
     * @return Retourne "X" si son état est "true, ou "O" si son état est
     * "false"
     */
    @Override
    public String toString() {
        if (this.etat == true) {
            return "X";
        } else {
            return "O";
        }
    }

}
