package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(35);
        son.Career(); // this is going to print the career method in son class.
        System.out.println(son.age);

        daughter dau = new daughter(29);
        dau.Career(); // this going to print the career method in daughter class.
        System.out.println(dau.age);

        Parent.hello(); // this is going to print the static method in the abstract classs
        // we are calling it by the name of the parent class becuase we do not need to create an object for a static class.


    }
}
