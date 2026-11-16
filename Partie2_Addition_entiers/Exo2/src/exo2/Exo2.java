/*
 * ============================================================
 *  Nom      : RAMI Rayan
 *  Groupe   : BDML 3
 *  TP0      : Présentation de NetBeans
 *  Partie 2 : Addition d'entiers (projet Exo2)
 *  Rôle     : Calcule la somme des nb premiers entiers,
 *             nb étant saisi au clavier
 *  Date     : 16/11/2026
 * ============================================================
 */
package exo2;

import java.util.Scanner; // Étape 6 : saisie au clavier

public class Exo2 {

    public static void main(String[] args) {

        //Declaration des variables
        int nb; // nombre d entiers a additionner
        int result; // resultat
        int ind; //indice

        // Étape 6 : nb n'est plus fixé à 5, il est saisi au clavier
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier
        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            // Étape 5d : correction trouvée avec le débogueur.
            // ind n'était jamais incrémenté, la condition ind <= nb
            // restait toujours vraie : boucle infinie.
            ind = ind + 1;
        }

        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est: " + result);
    }
}
