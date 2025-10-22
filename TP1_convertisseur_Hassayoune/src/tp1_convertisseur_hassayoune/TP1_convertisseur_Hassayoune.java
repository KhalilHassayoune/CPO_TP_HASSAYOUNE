/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_hassayoune;

import java.util.Scanner;

/**
 *
 * @author khalo
 */
public class TP1_convertisseur_Hassayoune {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) {
        
        double kelvin=tCelcius+273.15;
        return kelvin ;
        
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        
        double Celcius=(tFarenheit-38)/1.8;
        return Celcius ;
        
    }
    public static double CelciusVersFarenheit (double Celcius) {
        
        double Farenheit=(Celcius*(9/5))+32;
        return Farenheit ;
    public static double KelvinVersFarenheit (double Kelvin) {
        
        double Farenheit=((Kelvin- 273,15) * 1,8) + 32;
        return Farenheit ; 
        
    public static void main(String[] args) {Scanner sc = new Scanner(System.in); 
         double Valeur_Reel = sc.nextDouble();
         double temp = Valeur_Reel+273;
         System.out.println("la temperature en kelvin est=" + temp);
        // TODO code application logic here
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double Valeur_Reel = temp 
}
    
}

