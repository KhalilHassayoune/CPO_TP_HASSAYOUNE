package Armes;

import tp3_heroic_fantasy_hassayoune.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class Guerrier extends Personnage{
    private boolean aCheval;
    
    
    public Guerrier(String nom, int niveaudevie, int par1, boolean aCheval) {
        super(nom, niveaudevie);
        this.aCheval = aCheval;
    }
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    
}
