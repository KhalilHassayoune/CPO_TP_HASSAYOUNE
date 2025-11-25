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
public class Baton extends Arme{
    int age;

    public Baton(String nomArme, int niveauArme,int age ) {
        super(nomArme, niveauArme);
        if (age> 100)age=100;
        this.age =age;
        
    }
    
    
}
