

/*import java.util.Scanner;

public class Lommeregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // interact med brugeren via Scanner - først int a,
        System.out.println("Indtast tal a");
        double a = scanner.nextDouble();

        System.out.println("Indtast tal b");
        double b = scanner.nextDouble();

        //Udfør og print beregninger
        System.out.println("\nResultater");
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subraktion " + subtract(a, b));
        System.out.println("Multiplikation " + multiply(a, b));
        System.out.println("Division " + divide(a, b));

        //Bonus: Modulus (remainder)
        System.out.println("Modulus remainder " + modulus(a, b));

        scanner.close();

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        if (b == 0) {
            System.out.println("Alt divideret med 0 = 0");
            return 0; //Returnerer 0, hvis man dividerer med 0
        }
        return a / b;
    }
    public static double modulus(double a, double b){
        if (b == 0){
            System.out.println("Udregning af Modulus med 0 ikke tilladt");
            return 0;
        }
        return a % b;
        // Retunerer restproduktet EFTER at a / b, feks. 10 / 2 = 5, hvor modulus =
    }
}
