 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_hassayoune;

/**
 *
 * @author khalo
 */
public class TP2_Bieres_HASSAYOUNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;

uneBiere.Nom = "Cuve des trolls";
uneBiere.degreAlcool = 7.0 ;
BouteilleBiere brasserie = new BouteilleBiere() ;
brasserie.Nom = "Dubuisson";
brasserie.ouverte=false  ;
uneBiere.lireEtiquette();
    }
    
}
