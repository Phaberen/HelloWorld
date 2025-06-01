/*public class IterateThroughArray {

    // Deklarer arrayet uden for main
    static double[] ArrayOf5 = {4.5, 25.3, 12.1, 34.0, 15.5};
    static double min;
    static double max;

    public static void main(String[] args) {
        // Kald metoderne
        printArray();
        findSquare();
        findMinValue();
        findMaxValue();
    }

    // Metode til at printe hele arrayet
    public static void printArray() {
        for (int i = 0; i < ArrayOf5.length; i++) {
            System.out.println(ArrayOf5[i]);
        }
    }

    // Metode til at finde kvadratet af hvert element
    public static void findSquare() {
        for (int i = 0; i < ArrayOf5.length; i++) {
            double kvadreret = Math.pow(ArrayOf5[i], 2);
            System.out.println(ArrayOf5[i] + " ^ 2 = " + kvadreret);
        }
    }

    // Metode til at finde den mindste værdi
    public static void findMinValue() {
        min = ArrayOf5[0]; // Start med første værdi
        for (int i = 1; i < ArrayOf5.length; i++) {
            if (ArrayOf5[i] < min) {
                min = ArrayOf5[i];
            }
        }
        System.out.println("Mindste værdi: " + min);
    }

    //Metode til at finde den største værdi
    public static void findMaxValue() {
        max = ArrayOf5[0];
        for (int i = 0; i < ArrayOf5.length; i++){
            if (ArrayOf5[i] > max) {
                max = ArrayOf5[i];
            }
        }

        System.out.println("Maximale værdi " + max);
    }
}
