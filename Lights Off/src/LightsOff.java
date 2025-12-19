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
    }
}
    
    

