/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* Mini Projet - LightOff
* Date: 25/10/23
 */
package lightoff_maczkowiak_version_console;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    private static int difficulty;
    private int[] coord = new int[2];
    Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    /**
     * Initialise la grille entant que GrilleDeJeu 
     * Initialise le niveau de difficulté "difficulty" à 0 pour forcer 
     * la selection de la difficulté dans "Menu()"
     */
    public Partie() {
        this.grille = new GrilleDeJeu(5, 5);
        difficulty = 0;
    }

    public void Menu() {
        int lvl, x_val = 2, y_val = 2;
        System.out.println("""
                           Choisissez un niveau de difficulté:
                           1)Facile
                           2)Normal
                           3)Difficile
                           """);
        while (difficulty == 0) {
            lvl = sc.nextInt();
            if(lvl==1){
                difficulty = 1;
                x_val = y_val = 4;
            }
            if(lvl==2){
                difficulty = 2;
                x_val = y_val = 6;
            }
            if (lvl==3){
                difficulty = 3;
                    while (x_val == y_val) {
                        x_val = rand.nextInt(7, 9);
                        y_val = rand.nextInt(7, 9);
                    }
            }
            else{
                System.out.println("Veuillez choisir un niveau de difficulté existant");
                }
        }
        coord[0] = x_val;
        coord[1] = y_val;
        grille.genererNouvelleMatriceCellulesLumineuses(coord[0], coord[1]);
    }

    /**
     *
     * @return Retourne le niveau de difficulté de la partie
     */
    public static int getDifficulty() {
        return difficulty;
    }

    /**
     * Appèle "melangerMatriceAleatoirement()" pour changer l'état des cellules
     * de façon aléatoire 
     * Initialise ensuite le nombre de coups joué "nbCoups" à 0 si la difficulté
     * est "facile" ou "normale", ou à 20 si la difficulté est "difficile".
     */
    public void initialiserPartie() {
        this.grille.melangerMatriceAleatoirement(20);
        if (difficulty == 3) {
            this.nbCoups = 20;
        } else {
            this.nbCoups = 0;
        }
    }

    /**
     * Emule la boucle de jeu Affiche la grille puis lance la boucle de jeu
     * jusqu'à ce que l'ensemble des cellules sont à l'état "false", via
     * "cellulesToutesEteintes()" Affiche les actions possibles: d'abord si on
     * souhaite changer une ligne, une colonne ou une diagonale, puis laquelle
     * on souhaite changer Affiche ensuite la grille mise à jour et incrémente
     * "nbCoups"
     * Une fois la partie terminée, affiche le nombre de coups effectué (nombre de coups
     * restants dans la difficulté difficile) et remet la difficulté à 0.
     */
    public void lancerPartie() {
        System.out.println(grille);
        int op, select;
        while (grille.cellulesToutesEteintes() != true) {
            select = grille.nbColonnes + 1;
            System.out.print("""
                             Selectionner l'action a effectuee:
                             1)Activer une ligne
                             2)Activer une colonne
                             3)Activer une diagonale
                             """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    while (select > grille.nbLignes || select < 0) {
                        System.out.println("Choisir la ligne a activer");
                        select = sc.nextInt();
                    }
                    grille.activerLigneDeCellules(select);
                    break;
                case 2:
                    while (select > grille.nbColonnes || select < 0) {
                        System.out.println("Choisir la colonne a activer");
                        select = sc.nextInt();
                    }
                    grille.activerColonneDeCellules(select);
                    break;
                case 3:
                    System.out.println("""
                                       Selectionner la diagonale a activer:
                                       1)Diagonale descendante
                                       2)Diagonale montante
                                       """);
                    select = sc.nextInt();
                    while (select != 1 || select != 2) {
                        if (select == 1) {
                            grille.activerDiagonaleDescendante();
                        }
                        if (select == 2) {
                            grille.activerDiagonaleMontante();
                        } else {
                            System.out.println("Selectionner une diagonale");
                        }
                    }

                default:
                    System.out.println("Selectionner une operation");
                    break;
            }
            if(difficulty!=3){
                ++nbCoups;
                System.out.println("Nombre de coups effectués : "+nbCoups);
            }
            else{
                --nbCoups;
                System.out.println("Nombre de coups restants : "+nbCoups);
                
            }
            System.out.println(grille);
        }
        if(difficulty!=3){
            System.out.println("Nombre de coups effectués : "+nbCoups);
        }
        else{
            System.out.println("Nombre de coups restants : "+nbCoups);
        }
        difficulty=0;
    }

}
