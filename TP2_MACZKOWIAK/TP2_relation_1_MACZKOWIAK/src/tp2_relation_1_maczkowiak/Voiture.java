/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP2 Exercice 4
* Date: 06/10/23
 */
package tp2_relation_1_maczkowiak;

/**
 *
 * @author lukha
 */
public class Voiture {
    String modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;
    
    public Voiture(String mod,String marque, int puissance){
        modele=mod;
        Marque=marque;
        PuissanceCV=puissance;
        Proprietaire=null;

    }
    
    @Override /*Recris la méthode toString par défaut*/
    public String toString() {
        /* N'a pas besoin d'être appelé, remplace le print de l'objet*/
        String chaine_a_retourner;
        chaine_a_retourner = (modele +" "+ Marque +" ("+PuissanceCV+")");
        return chaine_a_retourner ;
}
}
