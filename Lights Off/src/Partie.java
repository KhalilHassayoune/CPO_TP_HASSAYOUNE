/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
import java.util.Scanner;
public class Partie {
    Grille grille;
    int nbCoups;

    public Partie() {
        this.nbCoups = 0;
        this.grille = new Grille(5, 5);
    }
    public void initialiserPartie() {
    
    this.grille.melangerMatriceAleatoirement(10);
    
    
    this.nbCoups = 0;
}
    public void lancerPartie() {
    Scanner sc = new Scanner(System.in);
    this.initialiserPartie();
    System.out.println(grille.toString());
        while (grille.cellulesToutesEteintes() == false) {
        System.out.println("Entrez votre coup (ex: L0 pour ligne 0, C1 pour colonne 1, D pour diagonale) :");
        String saisie = sc.nextLine();

        // Analyse de la saisie et activation
        if (saisie.startsWith("L")) {
            int i = Integer.parseInt(saisie.substring(1));
            grille.activerLigneDeCellules(i);
        } else if (saisie.startsWith("C")) {
            int j = Integer.parseInt(saisie.substring(1));
            grille.activerColonneDeCellules(j);
        } else if (saisie.equals("D1")) {
            grille.activerDiagonaleDescendante();
        } else if (saisie.equals("D2")) {
            grille.activerDiagonaleMontante();
        }

        
        this.nbCoups++;
        System.out.println("Coups joués : " + this.nbCoups);

        
        System.out.println(grille.toString());
    }

    
    System.out.println("Partie terminée ! Nombre total de coups : " + this.nbCoups);
}
}
    
    

