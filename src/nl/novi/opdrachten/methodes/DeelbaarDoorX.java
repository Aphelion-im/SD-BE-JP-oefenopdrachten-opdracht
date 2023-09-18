package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 * <p>
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 * <p>
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 * <p>
 * VOORBEELD:
 * <p>
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 * <p>
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 */

public class DeelbaarDoorX {


    public static void main(String[] args) {

        deelbaarDoorX(13, 3);
        deelbaarDoorX(14, 3);
        deelbaarDoorX(15, 3);
    }

    public static void deelbaarDoorX(int number, int divisible) {
        int remainder = number % divisible;
        double deling = (double) remainder / divisible;

        if (number % divisible == 0) {
            System.out.println(number + " is deelbaar door " + divisible);
        } else if (deling < 0.5) {
            System.out.print(number + " is niet deelbaar door " + divisible + ".");
            System.out.println(" Verlaag het getal met " + remainder);
        } else {
            System.out.print(number + " is niet deelbaar door " + divisible + ".");
            System.out.println(" Verhoog het getal met " + (divisible - remainder));
        }
    }
}
