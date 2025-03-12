public class Triangle {

    //  Variabler
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;


    // Constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {

        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // Areal af trekant
    public double findArea() {
        return (this.base * this.height) / 2;
    }

    public String toString() {
        return "{Triangle Measurements} " +
                "base = " + base +
                ", height = " + height +
                ", sideLenOne = " + sideLenOne +
                ", sideLenTwo = " + sideLenTwo +
                ", sideLenThree = " + sideLenThree;

    }
}
