/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP1 Exercice 3
* Date: 26/09/23
 */
package tp1_guessmynumber_maczkowiak;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class TP1_guessMyNumber_MACZKOWIAK {

    public static Scanner sc = new Scanner(System.in);
    public static Random generateurAleat = new Random();
    
    public static void main(String[] args) {
        /*Variables*/
        int op=0;
        
        
        
        /*Selection difficulté*/
        System.out.print("""
                         Choisissez un niveau de difficulté :
                         1) Facile
                         2) Normal
                         3) Difficile
                         4) Cauchemar
                         """);
        while (op>4 ||op<1){
            op=sc.nextInt();
            if(op==1){
                System.out.println("Niveau de difficulté selectionné: facile");
            }
            else if(op==2){
                System.out.println("Niveau de difficulté selectionné: normal");
            }
            else if(op==3){
                System.out.println("Niveau de difficulté selectionné: difficile");
            }
            else if(op==4){
                System.out.println("Niveau de difficulté selectionné: cauchemar");
            }
            else {
                System.out.println("Veuillez selectionner une difficulte");
            }
        }
        difficulte(op);
    }
    public static void difficulte(int dif){
        if (dif==1){
            facile();
        }
        if (dif==2){
            normal();
        }
        if (dif==3){
            difficile();
        }
        if(dif==4){
            cauchemar();
        }
    }
    
    public static void facile(){
        int n, nb, i=1;
        
        /*Boucle jeu*/
        n = generateurAleat.nextInt(40);
        System.out.println("Devinez un nombre en 0 et 40");
        nb = sc.nextInt();
        while (n != nb) {
            if (n < nb) {
                if (nb/n>10){
                    System.out.println("Beaucoup trop grand");
                }
                else{
                    System.out.println("Trop grand"); 
                }  
            }
            if (n > nb) {
                if (n/nb>10){
                    System.out.println("Beaucoup trop petit");
                }
                else {
                    System.out.println("Trop petit"); 
                }  
            }
            i+=1;
            System.out.println("Saisissez un autre nombre");
            nb = sc.nextInt();
        }
        System.out.println("Gagné \n Nombre de tentatives: "+i);
    }
    public static void normal(){
        int n, nb, i=1;
        
        /*Boucle jeu*/
        n = generateurAleat.nextInt(100);
        System.out.println("Devinez un nombre en 0 et 100");
        nb = sc.nextInt();
        while (n != nb||i<20) {
            if (n < nb) {
             System.out.println("Trop grand");
            }
            if (n > nb) {
             System.out.println("Trop petit");
            }
            System.out.println("Nombre de tentatives restantes: "+ (20-i));
            i+=1;
            System.out.println("Saisissez un autre nombre");
            nb = sc.nextInt();
        }
        if (i==20){
            System.out.println("Perdu");
        }
        else{
            System.out.println("Gagné \n Nombre de tentatives: "+i);
        }
    }
    public static void difficile(){
        int n, nb, i=1;
        
        /*Boucle jeu*/
        n = generateurAleat.nextInt(100);
        System.out.println("Devinez un nombre en 0 et 100");
        nb = sc.nextInt();
        while (n != nb ||i<10) {
            if (n < nb) {
             System.out.println("Trop grand");   
            }
            if (n > nb) {
             System.out.println("Trop petit");   
            }
            System.out.println("Nombre de tentatives restantes: "+ (10-i));
            i+=1;
            System.out.println("Saisissez un autre nombre");
            nb = sc.nextInt();
        }
        if (i==10){
            System.out.println("Perdu");
        }
        else{
            System.out.println("Gagné \n Nombre de tentatives: "+i);
        }
    }
    public static void cauchemar(){
        int n, nb, i=1;
        
        /*Boucle jeu*/
        n = generateurAleat.nextInt(100);
        System.out.println("Devinez un nombre en 0 et 100");
        nb = sc.nextInt();
        while (n != nb ||i<10) {
            if (n < nb) {
                if (generateurAleat.nextInt(100)<=30){
                    System.out.println("Trop petit");
                }
                else{
                    System.out.println("Trop grand");  
                } 
            }
            if (n > nb) {
                if (generateurAleat.nextInt(100)<=30){
                    System.out.println("Trop grand");
                }
                else{
                    System.out.println("Trop petit"); 
                }  
            }
            System.out.println("Nombre de tentatives restantes: "+ (10-i));
            i+=1;
            System.out.println("Saisissez un autre nombre");
            nb = sc.nextInt();
        }
        if (i==10){
            System.out.println("Perdu");
        }
        else{
            System.out.println("Gagné \n Nombre de tentatives: "+i);
        }
    }

}
