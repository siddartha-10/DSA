package AbstractClasses;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey ");
    }

    void normal(){
        System.out.println("This is just a normal class");
    }

    abstract void Career();
    abstract void partner();
}
