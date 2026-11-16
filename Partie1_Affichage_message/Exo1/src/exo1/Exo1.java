/*
 * ============================================================
 *  Nom      : RAMI Rayan
 *  Groupe   : BDML 3
 *  TP0      : Présentation de NetBeans
 *  Partie 1 : Affichage d'un message (projet Exo1)
 *  Rôle     : Affiche un message, demande le prénom de
 *             l'utilisateur et le salue de façon personnalisée
 *  Date     : 16/11/2026
 * ============================================================
 */
package exo1;

import java.util.Scanner; // Étape 6 : import ajouté via l'ampoule de NetBeans

public class Exo1 {

    public static void main(String[] args) {
        // Étape 3c : premier message
        System.out.println("Bonjour");

        // Étape 6 : lecture du prénom avec la classe Scanner
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();

        // Étape 6 : message personnalisé
        System.out.println("Bienvenue " + prenom + " !");

        // Étape 5 : message d'au revoir (écrit avec l'auto-complétion)
        System.out.println("Au revoir " + prenom + " !");
    }
}
