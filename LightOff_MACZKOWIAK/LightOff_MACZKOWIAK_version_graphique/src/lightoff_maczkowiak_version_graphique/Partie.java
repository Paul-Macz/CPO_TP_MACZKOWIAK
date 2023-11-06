/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* Mini Projet - LightOff
* Date: 25/10/23
 */
package lightoff_maczkowiak_version_graphique;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    private static int difficulty=0;
    int[] coord = new int[2];
    Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    

    /**
     * Initialise la grille entant que GrilleDeJeu 
     * Initialise le niveau de difficulté "difficulty" à 0 pour forcer 
     * la selection de la difficulté dans "Menu()"
     */
    public Partie() {
        this.grille = new GrilleDeJeu(coord[0], coord[1]);
    }

    /**
     * Génère l'interface pour sélectionner le niveau de difficulté 
     * Détermine la taille de la matrice "grille" en fonction de la difficulté
     */
    

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
            this.nbCoups = 40;
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
            if(difficulty==3){
                System.out.println("Nombre de coups restants : "+nbCoups);
            }
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
                    select=0;
                    while (select != 1 || select != 2) {
                        select = sc.nextInt();
                        if (select == 1) {
                            select=Math.max(grille.nbColonnes,grille.nbLignes)+1;
                            while(select<0 ||select>Math.min(grille.nbColonnes,grille.nbLignes)-1){
                                System.out.println("Choisir la diagonale a activer");
                                select=sc.nextInt();
                            }
                            grille.activerDiagonaleDescendante(select);
                            break;
                        }
                        if (select == 2) {
                            select=Math.max(grille.nbColonnes,grille.nbLignes)+1;
                            while(select<0 ||select>Math.min(grille.nbColonnes,grille.nbLignes)-1){
                                System.out.println("Choisir la diagonale a activer");
                                select=sc.nextInt();
                            }
                            grille.activerDiagonaleMontante(select);
                            break;
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
            }
            System.out.println("test2 "+nbCoups);
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
