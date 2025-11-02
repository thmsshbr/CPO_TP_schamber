/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
* Nom : Schamber Thomas
 * Rôle du programme : Calculer la somme des entiers de 1 à n, n étant saisi au clavier
 * Date : 02/11/2025
 */
package tp0_.addition;

import java.util.Scanner; // import obligatoire pour lire au clavier

/**
 *
 * @author scham
 */
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;      // nombre d'entiers à additionner
        int result;  // résultat
        int ind;     // indice

        // création du scanner pour lire au clavier
        Scanner sc = new Scanner(System.in);

        // saisie du nombre
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt();

        // initialisation
        result = 0;
        ind = 1;

        // addition des nb premiers entiers
        while (ind <= nb) { // correction : <= pour inclure nb
            result = result + ind;
            ind++;
        }

        // affichage du résultat
        System.out.println("La somme des " + nb + " entiers est : " + result);

        // fermeture du scanner
        sc.close();
    }
}