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
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    
    public Personne(String lstname, String name){
        nom=lstname;
        prenom=name;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0;

    }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Proprietaire != null ){
            return false;
        }
        else{
            if (nbVoitures ==3){
                return false;
            }
            else{
                liste_voitures[nbVoitures]= voiture_a_ajouter;
                ++nbVoitures;
                voiture_a_ajouter.Proprietaire = this;
                return true;
            }
        }
    }
    
    @Override /*Recris la méthode toString par défaut*/
    public String toString() {
        /* N'a pas besoin d'être appelé, remplace le print de l'objet*/
        String chaine_a_retourner;
        chaine_a_retourner =(nom +" "+ prenom );
        return chaine_a_retourner;
}
}
