/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP2 Exercice 1
* Date: 04/10/23
 */
package tp2_bieres_maczkowiak;

/**
 *
 * @author lukha
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
    }

    public boolean Décapsuler(){
        if (ouverte!=true){
            ouverte = true;
            return true;
        }
        else{
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
    @Override /*Recris la méthode toString par défaut*/
    public String toString() {
        /* N'a pas besoin d'être appelé, remplace le print de l'objet*/
        String chaine_a_retourner;
        chaine_a_retourner = (nom + " (" + degreAlcool + " degrés) Ouverte ? ");
        if (ouverte == true ){
            chaine_a_retourner += "oui";
        } 
        else{
            chaine_a_retourner += "non" ;
        }
        return chaine_a_retourner ;
}
    
}
