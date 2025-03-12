import java.util.ArrayList;

public class Indkøbskurv {
    private ArrayList<Ordrelinje> kurv = new ArrayList<>();

    public void tilføjOrdrelinje(Ordrelinje ordrelinje) {
        kurv.add(ordrelinje);
    }

    public double beregnSamletPris() {
        double samletPris = 0;
        for (Ordrelinje ordre : kurv) {
            samletPris += ordre.beregnPris();
        }
        return samletPris;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Indkøbskurv:\n");
        for (Ordrelinje ordre : kurv) {
            sb.append(ordre).append("\n");
        }
        sb.append("Samlet pris: ").append(beregnSamletPris()).append(" kr");
        return sb.toString();
    }
}
