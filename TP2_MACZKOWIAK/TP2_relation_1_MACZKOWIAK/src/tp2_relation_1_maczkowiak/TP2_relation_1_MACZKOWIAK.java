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
public class TP2_relation_1_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne Bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio
                + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        Bob.liste_voitures[0] = uneClio;
        Bob.nbVoitures = 1;

        uneClio.Proprietaire = Bob;
        System.out.println("la premiere voiture de Bob est " + Bob.liste_voitures[0]);
        
        Bob.liste_voitures[1]= une2008;
        Bob.nbVoitures=2;
        une2008.Proprietaire = Bob;
        
        reno.liste_voitures[0]=uneMicra;
        reno.liste_voitures[1]=uneAutreClio;
        reno.nbVoitures=2;
        uneMicra.Proprietaire=reno;
        uneAutreClio.Proprietaire=reno;
        
        Voiture Fiat500 = new Voiture("500","Fiat",5);
        Bob.ajouter_voiture(uneMicra);
        reno.ajouter_voiture(Fiat500);
        System.out.println(Bob.liste_voitures[2]);
        System.out.println(reno.liste_voitures[2]);
        System.out.println(uneMicra);
        System.out.println(Fiat500);
    }
}
