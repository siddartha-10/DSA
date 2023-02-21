package Interfaces.ExtendedDemo2;

public interface A {
//    void fun();
    default void greeting(){
        System.out.println("Hey I am greeting from interface A");
    }

    default void greet(){
        System.out.println("Hey i am greet insider interface A");
    }

    static void meth(){
        System.out.println("Hey i am a static method in interface A");
    }
}
