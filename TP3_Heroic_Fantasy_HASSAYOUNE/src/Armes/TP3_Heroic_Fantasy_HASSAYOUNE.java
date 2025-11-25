/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Armes;

import Armes.Magicien;
import Armes.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import Armes.Guerrier;
import Armes.Magicien;
import java.util.ArrayList;

/**
 *
 * @author khalo
 */
public class TP3_Heroic_Fantasy_HASSAYOUNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arme pistolet =new Arme("pistolet",100);
       Epee premier =new Epee("Excalibur",7,5);
       Epee deuxieme =new Epee("Durandal",4,7);
       Baton first =new Baton("Chêne", 4, 5);
       Baton second =new Baton("Charme", 5, 6);
       ArrayList<String> tab = new ArrayList<String>();
       tab.add("Excalibur");
       tab.add("Durandal");
       tab.add("Chêne");
       tab.add("Charme");
       Magicien mag1 = new Magicien("Gandalf", 65, 200, true);   // confirmé
       Magicien mag2 = new Magicien("Garcimore", 44, 150, false); // novice
       Guerrier g1 = new Guerrier("Conan", 78, 50, false);     // à pied
       Guerrier g2 = new Guerrier("Lannister", 45, 40, true);  // à cheval
       ArrayList<Personnage> personnages = new ArrayList<>();
       personnages.add(mag1);
        personnages.add(mag2);
        personnages.add(g1);
        personnages.add(g2);
        
       
       
       
       
       
       
            
            
        }
        // TODO code application logic here

    private static boolean elementAt(String excalibur) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    

