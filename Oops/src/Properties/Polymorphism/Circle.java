package Properties.Polymorphism;

public class Circle extends Shapes{
    @Override // this is called annotation
    // this will run whenever the child class object is created
    // hence this going to override the parent method
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
