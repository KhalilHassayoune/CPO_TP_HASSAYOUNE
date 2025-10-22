/*
 TP0_calculette
 */
package tp0_calculette;

import java.util.Scanner;

/*calculer des operations
 */
public class TP0_calculette {

    /*20/10/2025
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator:"
                + "1) add"
                + "2) substract"
                + "3) multiply"
                + "4) divide\n"
                + "5) modulo");
        Scanner c = new Scanner(System.in);
        System.out.println();
        int operateur = sc.nextInt();
        Scanner cs = new Scanner(System.in);
        System.out.println("Entrer le nombre 1 :");
        int operande1 = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        System.out.println("Entrer le nombre 2 :");
        int operande2 = sc.nextInt();
        int resultat = 0;
        if (operateur == 1) {
            resultat = operande1 + operande2;
        }
        if (operateur == 2) {
            resultat = operande1 - operande2;
        }
        if (operateur == 3) {
            resultat = operande1 * operande2;
        }
        if (operateur == 4) {
            resultat = operande1 / operande2;
        }
        if (operateur == 5) {
            resultat = operande1 % operande2;
        
        }
        
        System.out.println("The result is :" + resultat);

    }

}
