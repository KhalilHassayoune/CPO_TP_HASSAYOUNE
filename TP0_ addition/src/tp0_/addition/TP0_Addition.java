/*
 TP0_Addition
 */
package tp0_.addition;

import java.util.Scanner;

/*addition d entiers
 */
public class TP0_Addition {

    /*20/10/2025
     */
public static void main(String[] args) {
        
int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
// initialisation
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
nb=sc.nextInt();

result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
 result=result+ind;
 ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + "entiers est:"+result); } 
    }
    

