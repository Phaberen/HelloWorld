public class Tile {

    private char letter;                  // Bogstavet på flisen
    private int value;                    // Pointværdien af flisen


    //Konstruktør til at initialisere værdierne
    public Tile(){

    }

    //Metode til at printe flisen information
    public void printChar(){
    System.out.println("Tile: " + letter + " | " + "Value: " + value);
    }

    // Getters
    public char getLetter(){
        return letter;
    }

    public int getValue(){
        return value;
    }

    //Setters
    public void setLetter(char letter){
        this.letter = letter;
    }

    public void setValue(int value){
        this.value = value;
    }
}
