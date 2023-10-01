/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP1 Exercice 4
* Date: 01/10/23
 */
package tp1_stats_maczkowiak;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class TP1_stats_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] tab = new int [6];
        int m, nb;
        String tab2="[";
        Random generateurAleat = new Random();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre m:");
        m=sc.nextInt();
        for (int i=1;i<m;i++){
            nb = generateurAleat.nextInt(6);
            ++tab[nb];
        }
        for (int i=0;i<tab.length;i++){
            if (i==tab.length-1){
                tab2+=(tab[i]/(double)m);
            }
            else{
                tab2+= (tab[i]/(double)m)+" ; ";
            }
        }
        tab2+="]";
        System.out.print(tab2);
    }
    
}
