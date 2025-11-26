/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_relation_1;

/**
 *
 * @author scham
 */
public class Tp_relation_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        
        Tartiflette assiette3 = assiette2;

        System.out.println("nb calories Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb calories Assiette 3 : " + assiette3.nbCalories);

       
        assiette2.nbCalories += 100;

        System.out.println("\nAprès modification :");
        System.out.println("nb calories Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb calories Assiette 3 : " + assiette3.nbCalories);

        
        Tartiflette tmp = assiette1;
        assiette1 = assiette2;
        assiette2 = tmp;

        System.out.println("\nAprès échange :");
        System.out.println("Assiette1 calories = " + assiette1.nbCalories);
        System.out.println("Assiette2 calories = " + assiette2.nbCalories);

       
        moussaka[] tab = new moussaka[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = new moussaka(100 + i);
        }

        System.out.println("\nAffichage des calories des 10 moussakas :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Moussaka " + i + " : " + tab[i].nbCalories);
        }
    }
}
    
    
