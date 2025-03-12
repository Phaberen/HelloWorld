public class Main {
    public static void main(String[] args) {
        Vare mælk = new Vare("Mælk", 7);
        Vare brød = new Vare("Brød", 12);
        Vare smør = new Vare("Smør", 20);

        Ordrelinje ordre1 = new Ordrelinje(mælk, 3);
        Ordrelinje ordre2 = new Ordrelinje(brød, 2);
        Ordrelinje ordre3 = new Ordrelinje(smør, 1);

        Indkøbskurv kurv = new Indkøbskurv();
        kurv.tilføjOrdrelinje(ordre1);
        kurv.tilføjOrdrelinje(ordre2);
        kurv.tilføjOrdrelinje(ordre3);

        System.out.println(kurv);
    }
}
