/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author khalo
 */
public class LightsOff {

  
    public static void main(String[] args) {
       CelluleLumineuse cellule = new CelluleLumineuse();
       System.out.println("Etat initial : " + cellule.toString());
       cellule.activerCellule();
        System.out.println("Apres activation : " + cellule.toString());
        System.out.println("La cellule est-elle allumee ? " + cellule.getEtat());
        cellule.eteindreCellule();
        System.out.println("Apres extinction : " + cellule.toString());
       Grille maGrille = new Grille(5, 5);
       System.out.println("--- Affichage de la grille initiale ---");
        System.out.println(maGrille);
        System.out.println("--- Activation de la ligne 1 ---");
        maGrille.activerLigneDeCellules(1);
        System.out.println("--- Activation de la colonne 1 ---");
        maGrille.activerColonneDeCellules(3);
        System.out.println(maGrille);
        System.out.println("--- Activation Diagonale Descendante (Haut-Gauche vers Bas-Droite) ---");
        maGrille.eteindreToutesLesCellules(); // On vide la grille pour y voir clair
        maGrille.activerDiagonaleDescendante();
        System.out.println(maGrille);
        System.out.println("--- Activation Diagonale Montante (Bas-Gauche vers Haut-Droite) ---");
        maGrille.eteindreToutesLesCellules(); 
        maGrille.activerDiagonaleMontante();
        System.out.println(maGrille);
        maGrille.eteindreToutesLesCellules();
        System.out.println("Grille avant mélange :");
        System.out.println(maGrille);
        int tours = 10;
        System.out.println("--- Mélange de la grille (" + tours + " tours) ---");
        maGrille.melangerMatriceAleatoirement(tours);
        System.out.println(maGrille);
        System.out.println("Toutes les cellules sont éteintes ? " + maGrille.cellulesToutesEteintes());
    }
}
    
    

