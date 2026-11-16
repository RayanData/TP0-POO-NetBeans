/*
 *  Nom      : RAMI Rayan
 *  Groupe   : BDML 3
 *  TP0      Partie 1 : Affichage d'un message
 *  Date     : 16/11/2026

 */
package exo1;

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Bonjour");
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();

        System.out.println("Bonjour " + prenom + " !");
        System.out.println("Au revoir " + prenom + ", a bientot !");
    }
}
