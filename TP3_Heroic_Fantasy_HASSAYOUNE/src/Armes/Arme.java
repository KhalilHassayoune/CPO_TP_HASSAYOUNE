/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author khalo
 */
public class Arme {
    String nomArme;
    int niveauArme;
     public Arme (String nomArme,int niveauArme){
         this.nomArme = nomArme;
         if (niveauArme> 100)niveauArme=100;
         this.niveauArme=niveauArme;}

    @Override
    public String toString() {
        return "Arme{" + "nomArme=" + nomArme + ", niveauArme=" + niveauArme + '}';
    }

    String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDegats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



         
    
     }
     

    

