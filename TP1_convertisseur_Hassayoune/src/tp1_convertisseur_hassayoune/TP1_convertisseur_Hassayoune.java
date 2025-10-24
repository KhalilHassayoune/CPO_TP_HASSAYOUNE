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
    public static double CelciusVersKelvin(double tCelcius) {

        double kelvin = tCelcius + 273.15;
        return kelvin;

    }

    public static double FarenheitVersCelcius(double tFarenheit) {

        double Celcius = (tFarenheit - 32) / 1.8;
        return Celcius;

    }

    public static double CelciusVersFarenheit(double Celcius) {

        double Farenheit = (Celcius * (9 / 5)) + 32;
        return Farenheit;
    }

    public static double KelvinVersFarenheit(double Kelvin) {

        double Farenheit = ((Kelvin - 273.15) * (9 / 5)) + 32;
        return Farenheit;

    }

    public static double FarenheitVersKelvin(double Farenheit) {

        double Kelvin = (Farenheit - 32) * (5 / 9) + 273.15;
        return Kelvin;
    }

    public static void main(String[] args) {
        System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc = new Scanner(System.in);

        double Valeur_Reel = sc.nextDouble();
        double temp = Valeur_Reel + 273;
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1)De Kelvin vers Farenheit");
        System.out.println("2)De FarenheitVersCelcius");
        System.out.println("3)De FarenheitVersKelvin");
        System.out.println("4)De CelciusVersFarenheit");
        System.out.println("5)De KelvinVersCelcius");
        System.out.println("6)De CelciusVersKelvin");
        System.out.println("7)De De Kelvin vers Celcius");

        Scanner c = new Scanner(System.in);
        double nbr_choisi = c.nextDouble();
        if (nbr_choisi == 1) {
            System.out.println("degré Kelvin est égal à"KelvinVersFarenheit(Valeur_Reel));
        }

    }}

    // TODO code application logic here

