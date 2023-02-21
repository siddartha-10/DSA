package Interfaces.ExtendedDemo2;

public interface B extends A {
    default void greet(){
        System.out.println("Hey I am the default method in Interface B");
    }
}
