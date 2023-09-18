package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 20;

        isDeelBaarDoorVijf(chosenNumber);

    }

    // Een getal is deelbaar door een ander als er geen rest is wanneer het eerste getal wordt gedeeld door het tweede of als
    // het resultaat geen decimalen heeft.
    public static void isDeelBaarDoorVijf(int number) {
        if (number % 5 == 0) {
            System.out.println("Deelbaar door vijf");
        } else {
            System.out.println("Ondeelbaar door vijf");
        }
    }


}
