package nl.novi.opdrachten.methodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Schrijf een methode die een List<Integer> ontvangt.
 * <p>
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 * <p>
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 */
public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        System.out.println(highestNumber(Arrays.asList(1, 4, 20, 6, 10)));
    }

    public static String highestNumber(List<Integer> list) {
        return "Het hoogste getal van de gegeven getallen is: " + Collections.max(list);
    }


}

/*
Of andere oplossing:
---
int hoogsteGetal = 0;
    for(int number : numbers) {
        if(number > hoogsteGetal) {
        hoogsteGetal = number;
        }
    }
 */