


// Importerer nødvendige utilities
// ie. scanner, arraylists, "collections" der kan sortere
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class listOfPets {
    public static void main(String[] args) {
        ArrayList<String> dyrListe = new ArrayList<>();

        //Tilføjer Strings til ArrayList
        dyrListe.add("Dog");
        dyrListe.add("Cat");
        dyrListe.add("Bird");
        dyrListe.add("Pig");
        dyrListe.add("Sheep");

        System.out.println(dyrListe);


        //Fjerner første element i ArrayList
        dyrListe.remove(0);
        //Printer ny liste hvor element 0, er fjernet.
        System.out.println("Ny liste " + dyrListe);


        //Tilføjer Scanner der modtager Strings
        // & gør kommende brugerinput til et element i vores ArrayList
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Angiv et dyr, som skal på dyreListen");
        String nytDyr = scanner.nextLine();
        dyrListe.add(nytDyr);
        System.out.println("Her er listen med din tilføjelse" + dyrListe);


        //Import utility der sorterer alfabetisk
        Collections.sort(dyrListe);
        System.out.println("Her er vores ArrayList ved navn dyrListe, i alfabetisk orden " + dyrListe);
        }




    }
