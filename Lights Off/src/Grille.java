/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class Grille {
   
CelluleLumineuse[][] matriceCellules = new CelluleLumineuse[5][5];
int nbLignes;
int nbColonnes;

    public Grille(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            // Ici, on crée l'objet lui-même
            this.matriceCellules[i][j] = new CelluleLumineuse();
        }
    }
        }
    }
}
       }
     
        
