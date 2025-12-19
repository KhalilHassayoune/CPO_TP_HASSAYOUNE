/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class CelluleLumineuse {
    private boolean etat;
    
public boolean estEteint() {
    
    if (etat == false) {
        return true;
    } else {
        return false;
    }
}
public void eteindreCellule() {
    this.etat = false; 
}
public void activerCellule() {
    this.etat = !this.etat; 
}
public String toString() {
    if (this.etat == true) {
        return "X";
    } else {
        return "O";
    }
}

public void CelluleLumineuses(boolean etat) {
        this.etat = etat;
    }

public boolean getEtat() {
    if (etat == true) {return true;}
    else {return false;}
    
}
}


