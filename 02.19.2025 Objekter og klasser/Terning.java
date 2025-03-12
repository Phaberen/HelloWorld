import java.util.Random;



public class Terning {
    int MAX = 6;
    int facevalue;
    Random random;


    public Terning() {
        facevalue = random.nextInt(MAX)+1;
        Random random = new Random();
    }


    void roll() {
        facevalue = random.nextInt(MAX)+1;
    }}

