/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;
import java.util.ArrayList;
import tp3_heroic_fantasy_maczkowiak.etreVivant;

/**
 *
 * @author lukha
 */
public abstract class Personnage implements etreVivant {

    private String nom;
    private int hp;
    private ArrayList<Arme> Weapons = new ArrayList<>();
    private Arme Arme_en_Main;
    private String Armedepredilection;
    static int nbPerso;

    @Override
    public void seFatiguer() {
        hp -= 10;
    }

    @Override
    public boolean estVivant() {
        if (hp > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void estAttaqué(int points) {
        hp -= points;
    }

    public void attaquer(Personnage cible) {
        int damage = this.Arme_en_Main.getAtk();
        if (this instanceof Guerrier && this.getArmesPredilection().contains(this.Arme_en_Main)) {
            Epee arme = (Epee) this.Arme_en_Main;
            damage = damage * arme.getFinesse();
        } else if (this instanceof Magicien && this.getArmesPredilection().contains(this.Arme_en_Main)) {
            Baton arme = (Baton) this.Arme_en_Main;
            damage = damage * arme.getAge();
        }
        this.seFatiguer();
        if (cible instanceof Magicien) {
            Magicien target = (Magicien) cible;
            if (target.confirmed == true) {
                damage = damage / 2;
            }
        }
        if (cible instanceof Guerrier) {
            Guerrier target = (Guerrier) cible;
            if (target.onhorse == true) {
                damage = damage / 2;
            }
        }

        cible.estAttaqué(damage);
    }

    public Personnage(String nom, int hp, String armepred) {
        ++nbPerso;
        this.nom = nom;
        this.hp = hp;
        this.Arme_en_Main = null;
        this.Armedepredilection = armepred;
    }

    public ArrayList getArmesPredilection() {
        ArrayList<Arme> ArmesdePred = new ArrayList<>();
        for (int i = 0; i < Weapons.size(); ++i) {
            if (Weapons.get(i).getClass().getName().equals(Armedepredilection)) {
                ArmesdePred.add(Weapons.get(i));
            }
        }
        return (ArmesdePred);
    }

    public int nbArmespred() {
        int nb = 0;
        for (int i = 0; i < Weapons.size(); ++i) {
            if ((Weapons.get(i).getClass().getName().equals(Armedepredilection))) {
                ++nb;
            }
        }
        return (nb);
    }

    public String getArmedepredilection() {
        return Armedepredilection;
    }

    public static int getNbPerso() {
        return nbPerso;
    }

    public ArrayList<Arme> getWeapons() {
        return Weapons;
    }

    public void Equiper(String arme) {
        for (int i = 0; i < Weapons.size(); ++i) {
            if (Weapons.get(i).getNom().equals(arme)) {
                System.out.println(Weapons.get(i).getNom() + " trouvee");
                Arme_en_Main = Weapons.get(i);
                System.out.println(Arme_en_Main.getNom() + " equipee");
                return;
            } else {
                System.out.println(arme + " n'a pas été trouvé dans l'inventaire de " + this.getNom());
            }
        }
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }

    public int getHp() {
        return hp;
    }

    public void AjouterArme(Arme weapon) {
        if (this.Weapons.size() == 5) {
            System.out.println(this.getNom() + " possède déjà 5 armes");

        } else {
            this.Weapons.add(weapon);
        }
        return;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void finalize() {
        nbPerso--;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", hp=" + hp + ", arme equipee=" + Arme_en_Main + " vivant ?=" + estVivant() + '}';
    }

}
