package AbstractClasses;

public class Son extends Parent{

    // this is used when there is just the varibale declared in the abstract class
//    public Son(int age) {
//        this.age = age;
//    }

    // this is used when there is a constructor used in the abstract class.
    public Son(int age) {
        super(age);
    }

    @Override
    void Career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love antonella");
    }

    @Override
    void normal() {
        System.out.println("This is the overriiden form of a normal method");;
    }
}
