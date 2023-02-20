package Interfaces;

// we dont need to mention methodas as abstract in interfaces they are by default abstract.
public interface Engine {

    static final int price = 78000;
    abstract void start();
    abstract void stop();
    abstract void accelarate();
}
