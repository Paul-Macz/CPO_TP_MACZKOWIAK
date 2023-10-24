/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.genererNouvelleMatriceCellulesLumineuses(p_nbLignes, p_nbColonnes);
        for (int i = 0; i < this.nbLignes; ++i) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[i][j] = new CelluleLumineuse();
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void genererNouvelleMatriceCellulesLumineuses(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < this.nbLignes; ++i) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

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
            this.activerDiagonaleDescendante();
        } //Diagonale montante
        else {
            this.activerDiagonaleMontante();
        }

    }

    public void genererMatriceAleatoire(int nbTours) {
        for (int i = 0; i < this.nbLignes; ++i) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
        for (int nb = 0; nb < nbTours; ++nb) {
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < this.nbColonnes; ++j) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < this.nbLignes; ++i) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        if (this.nbLignes < this.nbColonnes) {
            for (int i = 0; i < this.nbLignes; ++i) {
                matriceCellules[i][i].activerCellule();
            }
        }
        if (this.nbColonnes < this.nbLignes) {
            for (int j = 0; j < this.nbColonnes; ++j) {
                matriceCellules[j][j].activerCellule();
            }
        } else {
            for (int i = 0; i < this.nbLignes; ++i) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

    public void activerDiagonaleMontante() {
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
        }
    }
    public boolean cellulesToutesEteintes(){
        for(int i=0;i<nbLignes;++i){
            for(int j=0;j<nbColonnes;++j){
                if (matriceCellules[i][j].estEteint()==false){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String grille="   |";
        String line="";
        //Creation interligne
        String interline="";
        for(int j=0;j<((nbColonnes+1)*4);++j){
            interline+="-";
        }
        //Première Ligne
        for (int j=0;j<nbColonnes;++j){
            grille+=" "+j+" |";
        }
        grille+="\n"+interline+"\n";
        //Creation lignes
        for (int i=0;i<nbLignes;++i){
            line+=" "+i+" |";
            for(int j=0;j<nbColonnes;++j){
                line+=" "+matriceCellules[i][j]+" |";
            }
            line+="\n"+interline;
            if (i!=(nbLignes-1)){
                line+="\n";
            }
        }
        grille+=line;
        return grille;
    }
    
}
