/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* Mini Projet - LightOff
* Date: 25/10/23
 */
package lightoff_maczkowiak_version_console;

import java.util.Random;

/**
 *
 * @author lukha
 */
public class GrilleDeJeu {

    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules;
    public static Random rand = new Random();

    /**
     * Fait appel à "genererNouvelleMatriceCellulesLumineuses()" pour
     * initialiser la matrice matriceCellules en fonction du nombre de lignes et
     * de colonnes Initialise ensuite chaque case de la matrice en tant que
     * CelluleLumineuse et s'assure que son état vaut "false", via
     * "eteindreCellule()"
     *
     * @param p_nbLignes Initialise le nombre de lignes "nbLignes" égale à cette
     * valeur, via "genererNouvelleMatriceCellulesLumineuses()"
     * @param p_nbColonnes Initialise le nombre de colonnes "nbColonnes" égale à
     * cette valeur; via "genererNouvelleMatriceCellulesLumineuses()"
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.genererNouvelleMatriceCellulesLumineuses(p_nbLignes, p_nbColonnes);
        for (int i = 0; i < this.nbLignes; ++i) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[i][j] = new CelluleLumineuse();
                matriceCellules[i][j].eteindreCellule();  
            }
        }

    }

    /**
     * Initialise la matrice "matriceCellules" comme un tableau à deux
     * dimensions en fonction du nombre de lignes et de colonnes
     *
     * @param nbLignes Initialise le nombre de lignes "nbLignes" égale à cette
     * valeur
     * @param nbColonnes Initialise le nombre de colonnes "nbColonnes" égale à
     * cette valeur
     */
    public void genererNouvelleMatriceCellulesLumineuses(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
    }

    /**
     * Traverse l'ensemble des cases de "matriceCellules" et appel
     * "eteindreCellule()" pour passer leur état à "false"
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < this.nbLignes; ++i) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Réinitialise l'état de toutes les cases à "false", via
     * "eteindreToutesLesCellules()" Change ensuite l'état des cellules un
     * certain nombre de fois
     *
     * @param nbTours Le nombre de tours "nbTours" determine le nombre de fois
     * qu'on change l'état de lignes, colonnes ou diagonales
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        this.eteindreToutesLesCellules();
        for (int nb = 0; nb < nbTours; ++nb) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * Tire un nombre aléatoire entre 0 et 3, pour choisir si on change l'état
     * des cellules d'une ligne, d'une colonne, ou d'une diagonale aléatoire
     * Fait appel appele aux méthodes
     * "activerLigneDeCellules()",activerColonneDeCellules(),
     * activerDiagonaleDescendante() et activerDiagonaleMontante() en fonction
     * du cas selectionné 
     * Ensuite tire un autre nombre aléatoire, en fonction de "nbLignes" et "nbColonnes",
     * pour choisir quelle ligne, colonne ou diagonale changer
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
    int alea = rand.nextInt(3);
            //Ligne aléatoire
            if (alea == 0) {
                int x = rand.nextInt(this.nbLignes);
                this.activerLigneDeCellules(x);
            }
            //Colonne aléatoire
            if (alea == 1) {
                int y = rand.nextInt(this.nbColonnes);
                this.activerColonneDeCellules(y);
            }
            //Diagonale descendante
            if (alea == 2) {
                int x = rand.nextInt(Math.min(nbColonnes,nbLignes)-1);
                this.activerDiagonaleDescendante(x);
            } //Diagonale montante
            else {
                int x=rand.nextInt(nbColonnes-1);
                this.activerDiagonaleMontante(x);
            }
}

    /**
     * Change l'état de toutes les cellules d'une ligne sélectionnée
     *
     * @param idLigne Détermine la ligne en question
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < this.nbColonnes; ++j) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Change l'état de toutes les cellules d'une colonne sélectionnée
     *
     * @param idColonne Détermine la colonne en question
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < this.nbLignes; ++i) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     *Change l'état de toute les cellules d'une diagonale descendante choisie
     * @param idDiagD Determine la cellule de la première ligne où commence la diagonale
     */
    public void activerDiagonaleDescendante(int idDiagD) {
        for (int i = 0; i < Math.min(nbLignes,nbColonnes); ++i) {
                //Face atteinte ?
                if(i+idDiagD==Math.min(nbLignes, nbColonnes)){
                    break;
                }
                matriceCellules[i][i+idDiagD].activerCellule();
            }
    }

    /**
     *Change l'état de toute les cellules d'une diagonale montante choisie
     * @param idDiagM Determine la cellule de la dernière ligne où commence la diagonale
     */
    public void activerDiagonaleMontante(int idDiagM) {
        for (int i = 0; i < this.nbLignes; ++i) {
                //Face atteinte ?
                 if(i+idDiagM==Math.min(nbLignes, nbColonnes)){
                    break;
                }
                matriceCellules[nbLignes - i - 1][i+idDiagM].activerCellule();
            }
        /*
        if (this.nbColonnes == this.nbLignes) {
            for (int i = 0; i < this.nbLignes; ++i) {
                matriceCellules[nbLignes - i - 1][i].activerCellule();
            }
        }
        if (this.nbLignes < this.nbColonnes) {
            for (int i = 0; i < this.nbLignes; ++i) {
                matriceCellules[nbLignes - i - 1][i].activerCellule();
            }
        }
        if (this.nbColonnes < this.nbLignes) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[nbColonnes - j - 1][j].activerCellule();
            }
        }*/
    }

    /**
     * Traverse la grille pour vérifie que l'ensemble des cellules sont dans
     * l'état "false"
     *
     * @return Renvoie "true" si toutes les cellules ont l'état "false", ou
     * "false" si au moins une cellule est encore à l'état "true"
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; ++i) {
            for (int j = 0; j < nbColonnes; ++j) {
                if (matriceCellules[i][j].estEteint() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Produit l'interface de la grille "matriceCellules" de façon à avoir une
     * interface carrée, en séparant chaque ligne par une interligne composée de
     * "-" et chaque colonne par des "|". La première ligne affiche l'indice de
     * chacune des colonnes à partir de 0 La première colonne affiche l'indice
     * de chacune des lignes à partir de 0
     *
     * @return Renvoie la grille produite
     */
    @Override
    public String toString() {
        String grille = "   |";
        String line = "";
        //Creation interligne
        String interline = "";
        for (int j = 0; j < ((nbColonnes + 1) * 4); ++j) {
            interline += "-";
        }
        //Première Ligne
        for (int j = 0; j < nbColonnes; ++j) {
            grille += " " + j + " |";
        }
        grille += "\n" + interline + "\n";
        //Creation lignes
        for (int i = 0; i < nbLignes; ++i) {
            line += " " + i + " |";
            for (int j = 0; j < nbColonnes; ++j) {
                line += " " + matriceCellules[i][j] + " |";
            }
            line += "\n" + interline;
            if (i != (nbLignes - 1)) {
                line += "\n";
            }
        }
        grille += line;
        return grille;
    }

}
