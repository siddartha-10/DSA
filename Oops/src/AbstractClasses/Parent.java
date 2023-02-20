package AbstractClasses;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey ");
    }

    abstract void Career();
    abstract void partner();
}
