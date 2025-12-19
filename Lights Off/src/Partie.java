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
    this.grille.eteindreToutesLesCellules();
    this.grille.melangerMatriceAleatoirement(10);
    
    
    
}
    public void lancerPartie() {
    Scanner sc = new Scanner(System.in);
    this.initialiserPartie();
    
        while (!grille.cellulesToutesEteintes()) {
        System.out.println(grille);
        System.out.println("Entrez la ligne (0-4) :");
     int l = sc.nextInt();
        System.out.println("Entrez la colonne (0-4) :");
        int c = sc.nextInt();
grille.matriceCellules[l][c].activerCellule();
        
        if (l > 0) { 
            grille.matriceCellules[l - 1][c].activerCellule(); 
        }
        if (l < grille.nbLignes - 1) { 
            this.grille.matriceCellules[l + 1][c].activerCellule(); 
        }
        if (c > 0) { 
            this.grille.matriceCellules[l][c - 1].activerCellule(); 
        }
        if (c < grille.nbColonnes - 1) { 
            this.grille.matriceCellules[l][c + 1].activerCellule(); 
        }
        System.out.println(grille);
        
      
        
      
    }

    

}
}
    
    

