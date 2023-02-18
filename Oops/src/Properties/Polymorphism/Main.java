package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cricle = new Circle();
        Square square = new Square();
        Shapes s1 = new Square();

        shape.area(); // this prints the area method in the Shapes classs because it has it.
        cricle.area(); // this prints the area method in the cricle class as they have it.
        square.area(); // this prints the area method in the Square class as it has it.
        s1.area(); // this is giving the area of the shape


        // let's say the parent class doesn't have a method named area and we are referencing to it and we created an
        // object of the child class that has an method called area but the code will give you an error because there
        // is no overriding taking place
    }
}
