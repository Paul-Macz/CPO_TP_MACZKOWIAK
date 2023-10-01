/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP1 Exercice 1
* Date: 26/09/23
 */
package tp1_manipnombresint_maczkowiak;

import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class TP1_manipNombresInt_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Variables*/
        int nb1,nb2;
        
        /*Programme*/
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        nb1 = sc.nextInt();
        System.out.println("\n Entrer un autre nombre :");
        nb2 = sc.nextInt();
        System.out.println("Voici differentes interactions entre les nombres "+nb1+" et "+nb2+": \n Somme : "+ (nb1+nb2) 
                +"\n Difference : "+(nb1-nb2)+
                "\n Produit : "+(nb1*nb2)+
                "\n Quotient entier : "+(nb1/nb2)+
                "\n Reste par la division euclidienne : "+(nb1%nb2));
        
    }

}
