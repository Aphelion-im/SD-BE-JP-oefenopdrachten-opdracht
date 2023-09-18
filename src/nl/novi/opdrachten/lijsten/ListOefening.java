package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
        printUnorderedList(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        printOrderedList(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        checkIfExists(clubNames, "Ajax");
        checkIfExists(clubNames, "FC Almere");
        checkIfExists(clubNames, "Spartak Moscow");

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        checkClubPosition(clubNames, "FC Almere");

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        checkIfExists(clubNames, "AA Aachen");
        checkIfExists(clubNames, "AFC Amsterdam");
        checkIfExists(clubNames, "AFC");
        checkIfExists(clubNames, "Zlotty FC");
        checkIfExists(clubNames, "PSV Eindhoven");
        sortClubsAjaxFirst(clubNames);

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        sortClubsPsvLast(clubNames);

    }

    public static void printUnorderedList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void printOrderedList(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }
    }

    public static void checkIfExists(List<String> names, String name) {
        if (names.contains(name)) {
            System.out.println("List contains " + name + ": " + names.contains(name));
        } else {
            names.add(name);
            System.out.println(name + " added to the list!");
        }
        System.out.println("Here is the list: ");
        printOrderedList(names);
    }

    public static int checkClubPosition(List<String> names, String name) {
        System.out.println("The index of " + name + " is: " + names.indexOf(name));
        return names.indexOf(name);
    }

    public static void sortClubsAjaxFirst(List<String> names) {
        Collections.sort(names);
        while (checkClubPosition(names, "Ajax") != 0) {
        names.remove(0);
        }
        System.out.println("Here is the sorted Ajax first list:");
        printOrderedList(names);
    }

    public static void sortClubsPsvLast(List<String> names) {
        Collections.sort(names);
        while (checkClubPosition(names, "PSV Eindhoven") != names.size() - 1) {
            names.remove(names.size() - 1);
        }
        System.out.println("Here is the sorted PSV Eindhoven last list:");
        printOrderedList(names);
    }


}
