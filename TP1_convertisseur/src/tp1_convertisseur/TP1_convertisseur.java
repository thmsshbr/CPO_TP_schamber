package tp1_convertisseur;

import java.util.Scanner;

public class TP1_convertisseur {

    //Méthodes de conversion
    public static double CelciusVersKelvin(double tC){ return tC + 273.15; }
    public static double KelvinVersCelcius(double tK){ return tK - 273.15; }
    public static double FarenheitVersCelcius(double tF){ return (tF - 32) * 5.0/9.0; }
    public static double CelciusVersFarenheit(double tC){ return tC * 9.0/5.0 + 32; }
    public static double KelvinVersFarenheit(double tK){ return CelciusVersFarenheit(KelvinVersCelcius(tK)); }
    public static double FarenheitVersKelvin(double tF){ return CelciusVersKelvin(FarenheitVersCelcius(tF)); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bonjour, saisissez une valeur reelle : ");
        double val = sc.nextDouble();

        System.out.println("""
                Saisissez la conversion :
                1) C -> K
                2) K -> C
                3) F -> C
                4) C -> F
                5) K -> F
                6) F -> K
                """);
        /*
avec :          1) Celcius -> Kelvin
                2) Kelvin -> Celcius
                3) Farenheit -> Celcius
                4) Celcius -> Farenheit
                5) Kelvin -> Farenheit
                6) Farenheit -> Kelvin
*/
        int choix = sc.nextInt();

        double res;
        switch (choix) {
            case 1 -> { res = CelciusVersKelvin(val); System.out.printf("%.2f °C = %.2f K%n", val, res); }
            case 2 -> { res = KelvinVersCelcius(val); System.out.printf("%.2f K = %.2f °C%n", val, res); }
            case 3 -> { res = FarenheitVersCelcius(val); System.out.printf("%.2f °F = %.2f °C%n", val, res); }
            case 4 -> { res = CelciusVersFarenheit(val); System.out.printf("%.2f °C = %.2f °F%n", val, res); }
            case 5 -> { res = KelvinVersFarenheit(val); System.out.printf("%.2f K = %.2f °F%n", val, res); }
            case 6 -> { res = FarenheitVersKelvin(val); System.out.printf("%.2f °F = %.2f K%n", val, res); }
            default -> System.out.println("Choix invalide.");
        }
    }
}
