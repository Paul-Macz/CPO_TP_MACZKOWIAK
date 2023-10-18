/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP3 Exercice 1
* Date: 18/10/23
 */
package tp3_heroic_fantasy_maczkowiak;

import Personnages.*;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author lukha
 */
public class TP3_Heroic_Fantasy_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 Creation des Armes
        Epee Excalibur = new Epee(5, "Excalibur", 7);
        Epee Durandal = new Epee(7, "Durandal", 4);
        Baton Chene = new Baton(5, "Chêne", 4);
        Baton Charme = new Baton(6, "Charme", 5);

        //Creation listes
        ArrayList<Arme> Armes = new ArrayList<Arme>();
        Armes.add(Excalibur);
        Armes.add(Durandal);
        Armes.add(Chene);
        Armes.add(Charme);

        for (int i = 0; i < Armes.size(); ++i) {
            System.out.println(Armes.get(i));
        }

        //2 Creation personnages
        Magicien Gandalf = new Magicien(true, "Gandalf", 65);
        Magicien Garcimore = new Magicien(false, "Garcimore", 44);
        Guerrier Conan = new Guerrier(false, "Conan", 78);
        Guerrier Lannister = new Guerrier(true, "Lannister", 45);

        ArrayList<Personnage> Characters = new ArrayList<Personnage>();
        Characters.add(Conan);
        Characters.add(Lannister);
        Characters.add(Gandalf);
        Characters.add(Garcimore);
        for (int i = 0; i < Characters.size(); ++i) {
            System.out.println(Characters.get(i));
        }
        Guerrier Guts = new Guerrier(false, "Guts", 80);
        Magicien Schierke = new Magicien(true, "Schierke", 56);

        Epee DragonSlayer = new Epee(1, "DragonSlayer", 50);
        Epee SoA = new Epee(34, "Sword of Actuation", 70);
        Epee Massword = new Epee(25, "Master Sword", 40);

        Baton Spire = new Baton(8, "Spire", 10);
        Baton Benediction = new Baton(2, "Benediction", 7);
        Baton Oblivion = new Baton(40, "Oblivion", 39);

        Guts.AjouterArme(DragonSlayer);
        Guts.AjouterArme(SoA);
        Guts.AjouterArme(Spire);
        Guts.Equiper(Guts.getWeapons().get(0).getNom());

        Schierke.AjouterArme(Massword);
        Schierke.AjouterArme(Benediction);
        Schierke.AjouterArme(Oblivion);

        System.out.println("Nombre d'armes de predilection dans l'inventaire de "+Schierke.getNom()+" : " +Schierke.nbArmespred());
        System.out.println(Guts);
        System.out.println(Schierke);
        
        System.out.println("Nombre de personnages : "+Personnage.getNbPerso());
        
        Garcimore.finalize();
        System.out.println("Nombre de personnages : "+Personnage.getNbPerso());
        
        Guts.seFatiguer();
        System.out.println(Guts+" vivant ? "+Guts.estVivant());
        Guts.attaquer(Gandalf);
        System.out.println(Gandalf);
        
        System.out.println(DragonSlayer);
        System.out.println(Guts.getWeapons().get(0).getClass());
        System.out.println(Guts.getArme_en_Main().getAtk());
        
        //5.4
        Magicien Garcimor = new Magicien(false, "Garcimore", 44);
        Garcimor.AjouterArme(Chene);
        Garcimor.Equiper(Garcimor.getWeapons().get(0).getNom());
        Lannister.AjouterArme(DragonSlayer);
        Lannister.Equiper(Lannister.getWeapons().get(0).getNom());
        
        Garcimor.attaquer(Lannister);
        System.out.println(Lannister);
        System.out.println(Garcimor);
        
        Lannister.attaquer(Garcimor);
        System.out.println(Lannister);
        System.out.println(Garcimor);
    }

}
