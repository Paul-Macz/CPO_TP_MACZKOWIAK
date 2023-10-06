/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_maczkowiak;

/**
 *
 * @author lukha
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin(double tCelcius){
        ++nbConversions;
        return (tCelcius+273.15);
    } 
    
    public double KelvinVersCelcius(double tKelvin){
        ++nbConversions;
        return (tKelvin-273.15);
    }
    public double FarenheitVersCelcius(double tFarenheit){
        ++nbConversions;
        return ((5.0/9)*(tFarenheit-32));
    }
    public double CelciusVersFarenheit(double tCelcius){
        ++nbConversions;
        return((1.8*tCelcius)+32);
    }
    public double KelvinVersFarenheit(double tKelvin){
        ++nbConversions;
        return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    public double FarenheitVersKelvin(double tFarenheit){
        ++nbConversions;
        return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
    @Override
    public String toString () {
        return "nb de conversions "+ nbConversions;
    }

}
