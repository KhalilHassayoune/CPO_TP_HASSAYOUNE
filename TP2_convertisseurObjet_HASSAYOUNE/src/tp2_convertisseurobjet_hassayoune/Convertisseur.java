package tp2_convertisseurobjet_hassayoune;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur() {
    nbConversions = 0 ;
    }
    public  double CelciusVersKelvin(double tCelcius) {
nbConversions++; 
        double kelvin = tCelcius + 273.15;
        return kelvin;

    }
    public  double FarenheitVersCelcius(double tFarenheit) {
nbConversions++; 
        double Celcius = (tFarenheit - 32) / 1.8;
        return Celcius;

    }

    public  double CelciusVersFarenheit(double Celcius) {
nbConversions++; 
        double Farenheit = (Celcius * (9.0 / 5)) + 32;
        return Farenheit;
    }

    public  double KelvinVersFarenheit(double Kelvin) {
nbConversions++; 
        double Farenheit = ((Kelvin - 273.15) * (9.0 / 5)) + 32;
        return Farenheit;

    }

    public  double FarenheitVersKelvin(double Farenheit) {
nbConversions++; 
        double Kelvin = (Farenheit - 32) * (5.0 / 9) + 273.15;
        return Kelvin;
    }
    public  double KelvinVersCelcius(double kelvin) {
nbConversions++; 
        double tCelcius = kelvin - 273.15;
        return tCelcius;
    }
     public String toString() {
       return "nb de conversions"+ nbConversions;
             }
          

    
    
        
    
    
}
