public class Ordrelinje {
    private Vare vare;
    private int antal;

    public Ordrelinje(Vare vare, int antal) {
        this.vare = vare;
        this.antal = antal;
    }

    public double beregnPris() {
        return vare.getPris() * antal;  // Beregner totalpris
    }

    @Override
    public String toString() {
        return antal + " x " + vare.getNavn() + " = " + beregnPris() + " kr";
    }
}
