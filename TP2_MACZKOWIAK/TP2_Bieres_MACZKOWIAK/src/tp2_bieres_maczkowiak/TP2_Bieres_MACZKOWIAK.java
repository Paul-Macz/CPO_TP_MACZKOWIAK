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
public class TP2_Bieres_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        
        BouteilleBiere Bieretrois = new BouteilleBiere("Chouffe", 8.0, "Achouffe");
        
        BouteilleBiere Bierrequatre = new BouteilleBiere("Lagunitas IPA", 6.2, "Luganitas");
        
        BouteilleBiere Bierecinq = new BouteilleBiere("Affligem",6.7,"Affligem");
        
        uneBiere.Décapsuler();
        /*System.out.print(uneBiere.ouverte);*/
        System.out.println(uneBiere) ;
        
        Bieretrois.Décapsuler();
        Bierecinq.Décapsuler();
        System.out.println(Bieretrois);
        System.out.println(Bierecinq);

    }
    
}
