package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cricle = new Circle();
        Square square = new Square();

        shape.area(); // this prints the area method in the Shapes classs because it has it.
        cricle.area(); // this prints the area method in the cricle class as they have it.
        square.area(); // this prints the area method in the Square class as it has it.
    }
}
