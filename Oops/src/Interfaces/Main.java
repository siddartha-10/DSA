package Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        // what to print doesn't depend on the reference
        // But what all methods can we print will depend on the reference type
        // Here in line number 5 we can see that the object type is Car in car we already are implementing
        // brake but we cannot access here because the reference type here is Engine in engine we dont anything called as break
        // Hence it gives an error when we try to print car.brake;
        car.accelarate();
        car.stop();
        car.start();
    }
}
