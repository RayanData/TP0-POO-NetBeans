/*
 *  Nom      : RAMI Rayan
 *  Groupe   : BDML 3
 *  TP0      :  Partie 3 : Calculette
 *  Date     : 16/11/2026
 */
package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;

        // Exercice 2 : affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Exercice 3 : saisie de l'operateur
        operateur = sc.nextInt();

        // Exercices 7 et 8 : operateur errone teste AVANT de demander les operandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: the operator must be between 1 and 5.");
            System.exit(0);
        }

        // Exercice 4 : saisie de la premiere operande
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();

        // Exercice 5 : saisie de la deuxieme operande
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();

        // Exercice 6 : calcul et affichage du resultat
        switch (operateur) {
            case 1:
                System.out.println("The result is : " + (operande1 + operande2));
                break;
            case 2:
                System.out.println("The result is : " + (operande1 - operande2));
                break;
            case 3:
                System.out.println("The result is : " + (operande1 * operande2));
                break;
            case 4:
                if (operande2 == 0) {
                    System.out.println("Error: division by zero is impossible.");
                } else {
                    System.out.println("The result is : " + ((double) operande1 / operande2));
                }
                break;
            case 5:
                if (operande2 == 0) {
                    System.out.println("Error: modulo by zero is impossible.");
                } else {
                    System.out.println("The result is : " + (operande1 % operande2));
                }
                break;
        }
    }
}
