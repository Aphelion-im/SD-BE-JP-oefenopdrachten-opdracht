package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        addMembers(laResistanceMembers, "Arie");
        addMembers(laResistanceMembers, "Sjaak");
        addMembers(laResistanceMembers, "Henrie");
        addMembers(laResistanceMembers, "Piet");
        addMembers(laResistanceMembers, "Yvette");
        addMembers(laResistanceMembers, "Monsieur Leclerc");
        addMembers(laResistanceMembers, "Yvette");

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */
        printMembers(laResistanceMembers);

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:

        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24

        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    public static void printMembers(List<String> members) {
        for (String member : members) {
            System.out.println(member);
        }
    }

    public static void addMembers(List<String> members, String name) {
        boolean isUnique = true;
        for (String member : members) {
            if (name.equalsIgnoreCase(member)) {
                System.out.println(member + " already a member!");
                isUnique = false;
            }
        }
        if (isUnique) {
            members.add(name);
        }
    }


}
