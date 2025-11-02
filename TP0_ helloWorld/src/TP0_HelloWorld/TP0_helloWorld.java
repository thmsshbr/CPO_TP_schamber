/*
 * Nom : Schamber Thomas
 * Rôle : Afficher un message de bienvenue et d’au revoir personnalisé
 * Date : 02/11/2025
 */

package TP0_HelloWorld;

import java.util.Scanner;

public class TP0_helloWorld {

    public static void main(String[] args) {

        System.out.println("Bonjour");

        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Quel est votre prenom ?");
        prenom = sc.nextLine();

        System.out.println("Bonjour " + prenom + " !");
        System.out.println("Au revoir " + prenom + " !");
        
        sc.close();
    }
}

