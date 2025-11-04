/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_hassayoune;

/**
 *
 * @author khalo
 */
public class BouteilleBiere {
    String Nom;
    Double degreAlcool ;
    String brasserie ;
    boolean ouverte ;
        
public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
}
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

public boolean Décapsuler(){
    if (!ouverte){
    
    ouverte=true;
    return true;
    }
    else{
        System.out.println("erreur : biere\n" +"déjà ouverte");
        return false;
        
    }
}

}

    

