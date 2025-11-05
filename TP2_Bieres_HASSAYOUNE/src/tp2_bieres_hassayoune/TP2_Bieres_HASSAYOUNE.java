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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",
7.0 ,"Dubuisson") ;

uneBiere.Nom = "Cuve des trolls";
uneBiere.degreAlcool = 7.0 ;
String brasserie;
uneBiere.brasserie="Dubuisson";
boolean ouverte;
uneBiere.ouverte=false  ;
uneBiere.lireEtiquette();
BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",
6.6 ,"Abbaye de Leffe") ;

secondeBiere.Nom = " Leffe";
secondeBiere.degreAlcool = 6.6 ;

secondeBiere.brasserie="Abbaye de Leffe";
secondeBiere.lireEtiquette();
BouteilleBiere troisiemeBiere = new BouteilleBiere("corona",
10.0 ,"Abbaye de corona") ;
troisiemeBiere.lireEtiquette();
troisiemeBiere.Décapsuler();
BouteilleBiere nBiere = new BouteilleBiere("corona",
10.0 ,"Abbaye de corona") ;
nBiere.lireEtiquette();
nBiere.Décapsuler();
BouteilleBiere niemeBiere = new BouteilleBiere("corona",
10.0 ,"Abbaye de corona") ;
niemeBiere.lireEtiquette();
niemeBiere.Décapsuler();
System.out.println(uneBiere) ;
System.out.println(niemeBiere);
System.out.println(nBiere);

    }
    
}
