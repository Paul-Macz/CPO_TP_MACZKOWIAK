/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maczkowiak_version_console;

import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    Scanner sc = new Scanner(System.in);

    public Partie() {
        this.grille = new GrilleDeJeu(2, 2);
        this.grille.genererMatriceAleatoire(20);
        this.nbCoups = 0;
    }

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
                        System.out.print("Choisir la ligne a activer");
                        select = sc.nextInt();
                    }
                    grille.activerLigneDeCellules(select);
                    break;
                case 2:
                    while (select > grille.nbColonnes || select < 0) {
                        System.out.print("Choisir la colonne a activer");
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
                    switch (select) {
                        case 1:
                            grille.activerDiagonaleDescendante();
                            break;
                        case 2:
                            grille.activerDiagonaleMontante();
                            break;
                        default:
                            System.out.print("Selectionner une diagonale");
                            break;
                            
                    }
                default:
                    System.out.println("Selectionner une operation");
                    break;
            }
            ++nbCoups;
            System.out.println(grille);
        }
        System.out.println(nbCoups);
    }

}
