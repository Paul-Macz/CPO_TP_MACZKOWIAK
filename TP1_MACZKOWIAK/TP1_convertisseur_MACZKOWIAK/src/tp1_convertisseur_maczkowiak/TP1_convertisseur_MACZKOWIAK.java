/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP1 Exercice 2
* Date: 26/09/23
 */
package tp1_convertisseur_maczkowiak;

import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class TP1_convertisseur_MACZKOWIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer une temperature reelle :");
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
        op=sc.nextInt();
        if (op==1){
            System.out.println(val+" degré Celcius est égal à"+CelciusVersKelvin(val)+" Kelvin");
        }
        else if (op==2){
            System.out.println(val+" Kelvin est égal à"+KelvinVersCelcius(val)+" degré Celcius");
        }
        else if (op==3){
            System.out.println(val+" degré Farenheit est égal à"+FarenheitVersCelcius(val)+" degré Celcius");
        }
        else if (op==4){
            System.out.println(val+" degré Celcius est égal à"+CelciusVersFarenheit(val)+" degré Farenheit");
        }
        else if (op==5){
            System.out.println(val+" Kelvin est égal à"+KelvinVersFarenheit(val)+" degré Farenheit");
        }
        else if (op==6){
            System.out.println(val+" degré Farenheit est égal à"+FarenheitVersKelvin(val)+" Kelvin");
        }
        else{
            System.out.println("Veuillez chosir un opérateur valide");
        }
    }
    
    public static double CelciusVersKelvin(double tCelcius){
        return (tCelcius+273.15);
    } 
    
    public static double KelvinVersCelcius(double tKelvin){
        return (tKelvin-273.15);
    }
    public static double FarenheitVersCelcius(double tFarenheit){
        return ((5.0/9)*(tFarenheit-32));
    }
    public static double CelciusVersFarenheit(double tCelcius){
        return((1.8*tCelcius)+32);
    }
    public static double KelvinVersFarenheit(double tKelvin){
        return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
}
