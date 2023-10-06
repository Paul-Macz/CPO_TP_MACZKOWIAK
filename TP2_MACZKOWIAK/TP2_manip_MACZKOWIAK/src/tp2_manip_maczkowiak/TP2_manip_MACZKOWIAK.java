/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP2 Exercice 3
* Date: 06/10/23
 */
package tp2_manip_maczkowiak;

import java.util.Random;

/**
 *
 * @author lukha
 */
public class TP2_manip_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ; 
        
        /*Objectif 4)
        Deux tartiflettes ont été créées: assiette 1 et assiette2.
        Depuis l'instruction "Tartiflette assiette3 = assiette2", assiette2 et assiette3 référencent la même tartiflette.
        */
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2.nbCalories+=100;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        Tartiflette temp = assiette1;
        assiette1=assiette2;
        assiette2=temp;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        
        /*Objectif 6
        Moussaka assiette666 = assiette1 ;   assiette666 est une moussaka, elle ne peut pas référencer une tartiflette, la ligne est invalide
        Moussaka assiette667 = new Tartiflette() ; la ligne est incorrecte puisqu'il manque le nombre de calorie et pour la même raison que la première ligne
        Une référence objet annonçant référencer un type d'objet ne peut pas en référencer un autre objet qui n’a aucun rapport 
        */
        Moussaka [] tab = new Moussaka [10];
        for (int i=0; i<tab.length;++i){
            tab[i]= new Moussaka(600+i);
        }
        /*Question bonus
        Oui, on pourrait avoir un objet, et qu’une référence vers cet objet soit en fait un attribut d’un autre objet
        */
    }
    
}
