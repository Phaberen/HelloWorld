/*public class ArrayPlusLoop {
    public static void main(String[] args) {

        // Her Printes hele Arrayof8, men kun første og sidste slot er defineret
        // Derfor får vi 37, 0, 0, 0, 0, 0, 0, 117
        // Husk at pladserne tælles fra 0 og frem

        int[] Arrayof8 = new int[8];
        double[] Arrayof4 = new double[4];

        Arrayof8[0] = 37;
        Arrayof8[7] = 117;

        Arrayof4[0] = 3.4;
        Arrayof4[1] = 2.5;
        Arrayof4[2] = 1.2;
        Arrayof4[3] = 6.7;

        for (int i = 0; i < Arrayof8.length; i++) {
            System.out.println(Arrayof8[i]);
        }



        // Her printes index [1] Array.length antal gange, da det er under 4. Hvis [i] i stedet for 4,
        // Printes den Index antal gange
        for (int i = 0; i < Arrayof4.length; i++){
            System.out.println(Arrayof4[i]);
        }

        // Her hentes og printes Arrayof4[2] = 1.2
        System.out.println(Arrayof4[2]);

        // Her laves et Array af Strings ved navn "StringIndex", som printer
        //
        String[] StringIndex = {"Hej", "Med", "Dig"};
        for(String s : StringIndex) {
            System.out.print(s + " ");
        }

        // Denne command printer antallet af indexer i vores array (Arrayof4.length)
        // Med "\n" + Arrayof4.length);
        // "\n" udskriver på ny linje
        System.out.println("\n" + Arrayof4.length);




}}

