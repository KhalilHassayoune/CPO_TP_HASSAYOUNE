/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khalo
 */
public class Combinaison {
    private int[] combiSecrete = new int[4];
    private int[] combiTestee = new int[4];
    
    
public void genererCombiAleat() {
    
       
      
    for (int i = 0; i < 4; i++) {
        combiSecrete[i] = (int)(Math.random() * 10);
    }
}





public int[] comparerCombi() {
    int nbExact=0;
    int nbTropHaut=0;
    int nbTropBas=0;
    for (int i=0;i<4;i++){
        if (combiTestee[i] == combiSecrete[i]) 
            nbExact++;
         
        if (combiSecrete[i] > combiTestee[i]) 
            nbTropBas++;
        
// contenu ici
if (combiTestee[i] > combiSecrete[i]) 
            nbTropHaut++;
    }
        
return new int[]{nbExact, nbTropHaut,nbTropBas};
}
public void augmenterChiffre(int indice) {
     combiTestee[indice]++;
    if (combiTestee[indice] == 10) {
        combiTestee[indice] = 0;
    }
}
public int[] getCombiTestee() {
    return combiTestee;
}
public void diminuerChiffre(int indice) {
    combiTestee[indice]--;
    if (combiTestee[indice] == -1) {
        combiTestee[indice] = 9;
    }


}}
    
    
   



