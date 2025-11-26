/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Bieres_Schamber;

/**
 *
 * @author mmars
 9854*/
public class BouteilleBiere {
    String nom;
    double degresAlcool;
    String brasserie;
    boolean ouverte;

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degresAlcool +
 " degres) \nBrasserie : " + brasserie ) ;


}
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 nom = unNom;
 degresAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

}
