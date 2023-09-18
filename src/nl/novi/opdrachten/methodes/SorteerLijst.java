package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Schrijf een methode die een List<Integer> ontvangt.
 * <p>
 * Check in de methode of deze list 3 entries heeft.
 * <p>
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 * <p>
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 * <p>
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 */
public class SorteerLijst {

    public static void main(String[] args) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(88, 54, 35));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));

        checkList(wrongList);
        checkList(correctList);

    }


    public static void checkList(List<Integer> numbers) {
        int size = numbers.size();
        System.out.println("The size of the list is: " + size);
        if (size == 3) {
            numbers.sort(Comparator.naturalOrder()); // Valt dit wel of niet onder Collections.sort()?
            System.out.println(numbers);
        } else {
            System.out.println("Er zijn te veel of te weinig getallen in de lijst.");
        }
    }
}
