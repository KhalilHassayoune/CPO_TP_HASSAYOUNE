/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
import java.util.Random;
public class Grille {
   
public CelluleLumineuse[][] matriceCellules;
int nbLignes;
int nbColonnes;

    public Grille(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            
            this.matriceCellules[i][j] = new CelluleLumineuse();
        }
    }
        }
    public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
     for (int j = 0; j < nbColonnes; j++) { 
         this.matriceCellules[i][j].eteindreCellule();
     }  
    }
    }
    public void activerLigneColonneOuDiagonaleAleatoire() {
    Random rand = new Random();
   int l = rand.nextInt(nbLignes);
    int c = rand.nextInt(nbColonnes);
    this.matriceCellules[l][c].activerCellule();
    if (l > 0) this.matriceCellules[l - 1][c].activerCellule();
    if (l < nbLignes - 1) this.matriceCellules[l + 1][c].activerCellule();
    if (c > 0) this.matriceCellules[l][c - 1].activerCellule();
    if (c < nbColonnes - 1) this.matriceCellules[l][c + 1].activerCellule();
}
    

    public void melangerMatriceAleatoirement(int nbTours) {
   
    this.eteindreToutesLesCellules();

    
    for (int i = 0; i < nbTours; i++) {
        
        this.activerLigneColonneOuDiagonaleAleatoire();
    }
}



public void activerLigneDeCellules(int idLigne) {
    for (int j = 0; j < nbColonnes; j++) {
        
        this.matriceCellules[idLigne][j].activerCellule();
    }
}


public void activerColonneDeCellules(int idColonne) {
    for (int i = 0; i < nbLignes; i++) {
       
        this.matriceCellules[i][idColonne].activerCellule();
    }}
   
public void activerDiagonaleDescendante() {
    for (int i = 0; i < nbLignes; i++) {
        
        this.matriceCellules[i][i].activerCellule();
    }
}


public void activerDiagonaleMontante() {
    for (int i = 0; i < nbLignes; i++) {
        this.matriceCellules[nbLignes - 1 - i][i].activerCellule();
    }
}
public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            // Si on trouve une cellule qui n'est PAS éteinte
            if (this.matriceCellules[i][j].getEtat() == true) {
                return false; // On s'arrête, le joueur n'a pas encore gagné
            }
        }
    }
    // Si la boucle se termine sans avoir trouvé de cellule allumée
    return true; 
}
    @Override
public String toString() {
    String res = "   "; 

    
    for (int j = 0; j < nbColonnes; j++) {
        res += j + " ";
    }
    res += "\n"; 

    
    for (int i = 0; i < nbLignes; i++) {
        res += i + " |"; 
        
        for (int j = 0; j < nbColonnes; j++) {
            
            res += matriceCellules[i][j].toString() + " ";
        }
        res += "\n"; 
    }

    return res;
}

    }

       
     
        
