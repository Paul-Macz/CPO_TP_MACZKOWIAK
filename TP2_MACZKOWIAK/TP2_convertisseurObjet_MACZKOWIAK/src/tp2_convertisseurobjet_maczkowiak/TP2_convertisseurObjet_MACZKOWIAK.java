/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP2 Exercice 2
* Date: 04/10/23
 */
package tp2_convertisseurobjet_maczkowiak;

import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class TP2_convertisseurObjet_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objectifs 1 à 4
        Convertisseur convert = new Convertisseur();
        convert.CelciusVersKelvin(0);
        convert.KelvinVersFarenheit(0);
        convert.FarenheitVersCelcius(90);

        Convertisseur conv2 = new Convertisseur();
        conv2.CelciusVersFarenheit(32);
        conv2.FarenheitVersKelvin(15);
        System.out.println("convert: " + convert);
        System.out.println("conv2: " + conv2);

        // Objectif 5
        /*Variables*/
        int op;
        double val;

        Convertisseur conversion = new Convertisseur();
        Scanner sc = new Scanner(System.in);

        /*Conversion*/
        System.out.println("Entrez une temperature a convertir");
        val = sc.nextDouble();
        System.out.println("""
                Saisissez la conversion que vous souhaiter effectuer :
                1)De Celcius vers Kelvin
                2)De Kelvin vers Celcius
                3)De Farenheit vers Celcius
                4)De Celcius vers Farenheit
                5)De Kelvin vers Farenheit
                6)De Farenheit vers Kelvin
                """);
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println(val + " degré Celcius est égal à" + conversion.CelciusVersKelvin(val) + " Kelvin");
                break;
            case 2:
                System.out.println(val + " Kelvin est égal à" + conversion.KelvinVersCelcius(val) + " degré Celcius");
                break;
            case 3:
                System.out.println(val + " degré Farenheit est égal à" + conversion.FarenheitVersCelcius(val) + " degré Celcius");
                break;
            case 4:
                System.out.println(val + " degré Celcius est égal à" + conversion.CelciusVersFarenheit(val) + " degré Farenheit");
                break;
            case 5:
                System.out.println(val + " Kelvin est égal à" + conversion.KelvinVersFarenheit(val) + " degré Farenheit");
                break;
            case 6:
                System.out.println(val + " degré Farenheit est égal à" + conversion.FarenheitVersKelvin(val) + " Kelvin");
                break;
            default:
                System.out.println("Veuillez chosir un opérateur valide");
                break;
        }
        System.out.print(conversion);

    }

}
