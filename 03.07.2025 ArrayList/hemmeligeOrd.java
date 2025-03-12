import java.util.Scanner;
import java.util.ArrayList;

public class hemmeligeOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> hemmeligeOrd = new ArrayList<>();

        System.out.println("Vil du tilføje dine egne hemmelige ord? (ja/nej)");
        String valg = scanner.nextLine().toLowerCase();

        if (valg.equals("ja")) {
            System.out.println("Tilføj 3 hemmelige ord:");
            for (int i = 0; i < 3; i++) {
                System.out.println("Indtast ord " + (i + 1) + ":");
                hemmeligeOrd.add(scanner.nextLine().toLowerCase()); // Tilføjer brugerens ord
            }
        } else {
            //Tilføjer default words, hvis brugeren ikke selv inputter
            hemmeligeOrd.add("Super");
            hemmeligeOrd.add("Fuck");
            hemmeligeOrd.add("Cool");
        }

        System.out.println("\n Nu skal du gætte et hemmeligt ord!");

        // Bruger får flere forsøg til at gætte
        boolean korrektGaet = false;
        int forsøg = 0;
        int maxForsøg = 5;

        while (!korrektGaet && forsøg < maxForsøg){
            System.out.println(" Skriv dit gæt");
            String nytOrd = scanner.nextLine().toLowerCase();
            forsøg++;

            if(hemmeligeOrd.contains(nytOrd)) {
                System.out.println("Korrekt! Du gættede et hemmeligt ord: " + nytOrd);
                korrektGaet = true;
            } else {
                System.out.println("Forkert! Prøv igen. (Forsøg: " + forsøg + " af " + maxForsøg + ")");
                if (forsøg < maxForsøg) {
                    System.out.println("Hint: Ordet starter med '" + hemmeligeOrd.get(0).charAt(0) + "'...");
                }
            }
        }
    }}

