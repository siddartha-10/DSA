import java.util.*;
class B {
    public static void main(String[] args) {
        exam ex = new exam1();
        System.out.println(ex.b);
        ex.show();
    }
}
class exam{
    int a = 10;
    int b = 20;

    void show(){
        System.out.println("hello 1");
    }
}
class exam1 extends exam{
    int a = 20000;
    int b = 210;
    int c = 500;
    void show(){
        System.out.println("hello 2");
    }
}