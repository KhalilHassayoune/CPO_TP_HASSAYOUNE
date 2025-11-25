/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author khalo
 */
public class Epee extends Arme {
    int indice;
    public Epee(String nomArme, int niveauArme, int indice) {
        
        super(nomArme, niveauArme);
        if (indice> 100)indice=100;
        this.indice=indice;
      
    }

    
}
