/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_hassayoune;

import java.util.Scanner;

/**
 *
 * @author khalo
 */
public class TP1_manipNombresInt_HASSAYOUNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        int entier1 = sc.nextInt();
        Scanner c = new Scanner(System.in);
        int entier2 = sc.nextInt();
        int somme = entier1+entier2;
        System.out.println("la somme est =" + somme);
        int difference = entier1 - entier2;
        System.out.println("la difference est =" + difference);
        int produit = entier1*entier2;
        System.out.println("le produit est =" + produit);
        int quotient =entier1/entier2;
        int reste = entier1%entier2;
        System.out.println("le quotient est =" + quotient+" le reste est ="+reste);
                
        
        
        // TODO code application logic here
    }
    
}
