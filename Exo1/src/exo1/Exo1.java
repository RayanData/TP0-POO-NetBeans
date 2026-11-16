/*
 * ============================================================
 *  Nom      : RAMI Rayan
 *  Groupe   : BDML 3
 *  TP0      : Présentation de NetBeans - Partie 1 : Affichage d'un message
 *  Rôle     : Demande le prénom de l'utilisateur et affiche un message personnalisé
 *  Date     : 16/11/2026
 * ============================================================
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
