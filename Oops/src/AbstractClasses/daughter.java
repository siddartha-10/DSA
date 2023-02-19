package AbstractClasses;

public class daughter extends Parent{

    // this is used when there is just the varibale declared in the abstract class
//    public daughter(int age) {
//        this.age = age;
//    }

    // this is used when there is a constructor used in the abstract class.


    public daughter(int age) {
        super(age);
    }

    @Override
    void Career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Messi");
    }
}
