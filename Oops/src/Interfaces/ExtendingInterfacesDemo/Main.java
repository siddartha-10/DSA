package Interfaces.ExtendingInterfacesDemo;

/*
* so what happening here is when we are trying to extend an interface to another interface and implementing it to a main
* class then it simply inheritng the functions/methods in interface to interface B and since the methods are abstract
* we need to write the body for them(Here them includes all the methods that are in the implemented interface and also
* the interface that is extending the previous one)
*
* Example we can below Here we are implementing an interface called B and B only contains a method called as greet but
* it gives an error still  because B is Extending an interface A and that interface has an method called as fun
* Since B is exntending interface A that is why we need override all the methods in (A,B) interfaces
* */
public class Main implements B{
    @Override
    public void greet(){
        System.out.println("Hey! I am Siddarth.How are you guys doing?");
    }

    @Override
    public void fun(){
        System.out.println("Hey guys have fun");
    }
}
