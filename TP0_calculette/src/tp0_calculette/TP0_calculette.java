/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner; // import nécessaire pour lire au clavier

/**
 * TP0_calculette
 * @author scham
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operateur; // choix de l’opération
        double operande1, operande2, resultat = 0;

        // --- Étape 1 : Affichage du menu ---
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        System.out.print("Your choice: ");
        operateur = sc.nextInt();

        // --- Étape 2 : Vérification du choix ---
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: invalid operator number!");
            return; // quitte le programme
        }

        // --- Étape 3 : Saisie des opérandes ---
        System.out.print("Please enter the first number: ");
        operande1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        operande2 = sc.nextDouble();

        // --- Étape 4 : Calcul du résultat selon l’opérateur ---
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                // éviter la division par zéro
                if (operande2 == 0) {
                    System.out.println("Error: division by zero!");
                    return;
                }
                resultat = operande1 / operande2;
                break;
            case 5:
                // éviter le modulo par zéro
                if (operande2 == 0) {
                    System.out.println("Error: modulo by zero!");
                    return;
                }
                resultat = operande1 % operande2;
                break;
        }

        // --- Étape 5 : Affichage du résultat ---
        System.out.println("The result is: " + resultat);
    }

}

