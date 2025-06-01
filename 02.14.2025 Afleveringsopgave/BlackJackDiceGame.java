import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Random;
import java.util.Scanner;

/*public class BlackJackDiceGame {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    int userSum = 0, machineSum = 0;


    // Velkomst
        System.out.println("Velkommen til Blackjack.... m. Terninger.");
        System.out.println("Tryk Enter for at begynde spillet");
        scanner.nextLine(); // bruger skal trykke enter før første kast


    // 1. USER THROWS
        while (true) {

            //simulerer et kast med en terning(1-6)
            int roll = (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
            userSum += roll;

            System.out.println("Du slog " + roll + ". Din samlede sum er nu: " + userSum);

            //Hvis spilleren får over 21, har de tabt
            if (userSum > 21) {
                System.out.println("Du er oversteget 21. Huset vinder.... altid");
                break;
            }

            // Spørger brugeren om de vil fortsætte
            System.out.println("Vil du slå igen? (ja/nej); ");
            String answer = scanner.nextLine().toLowerCase();

            if (!answer.equals("ja")) {
                break;
            }
        }

        System.out.println("Din endelige sum er: " + userSum);


        // Hvis spilleren fik 21, har maskinen på forhånd tabt
        if (userSum == 21) {
            System.out.println("Tillykke, du fik 21. Huset taber.... (dog aldrig på sigt)");
            scanner.close();
            return;
        }

        // 2. MACHINE THROWS
        System.out.println("\nMaskinen kaster nu...");

        while (machineSum < 16) { //Maskinen stopper når tal er >16
            int roll = (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
            machineSum += roll;
            System.out.println("Maskinen slog en " + roll + ". Dens samlede sum er nu: " + machineSum);
        }

        System.out.println("Maskinens endelige sum er:" + machineSum);

        // 3. CHECK WHO WON

        System.out.println("\n--- Resultat ---");

        if (machineSum > 21) {
            System.out.println("Maskinen fik over 21! Du vinder!");
        } else if (machineSum == 21){
            System.out.println("Maskinen fik præcis 21! Du vinder!");
        } else if (userSum > machineSum){
            System.out.println("Din Sum er højere! Du vinder!");
        } else {
            System.out.println("Begge har samme sum! Det er uafgjort.");
        }

        scanner.close();
    }
}