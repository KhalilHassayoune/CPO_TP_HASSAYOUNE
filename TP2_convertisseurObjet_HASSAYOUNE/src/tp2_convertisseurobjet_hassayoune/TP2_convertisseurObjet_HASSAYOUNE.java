/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_hassayoune;

/**
 *
 * @author khalo
 */
public class TP2_convertisseurObjet_HASSAYOUNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur conv1 = new Convertisseur();
        System.out.println("25C en Kelvin : " + conv1.CelciusVersKelvin(25));
        System.out.println("77F en Celsius : " + conv1.FarenheitVersCelcius(77));
        System.out.println(conv1);
         Convertisseur conv2 = new Convertisseur();
        System.out.println("0K en Fahrenheit : " + conv2.KelvinVersFarenheit(0));
        System.out.println("100C en Fahrenheit : " + conv2.CelciusVersFarenheit(100));
        System.out.println("32F en Kelvin : " + conv2.FarenheitVersKelvin(32));
        System.out.println(conv2);
        
        }
    
}
