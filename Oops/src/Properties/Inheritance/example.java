package Properties.Inheritance;
class A {
    int a;

    int b;

}

class b extends A{
    int c;
}

//class c extends A{
//    c(){
//        System.out.println("this is c");
//    }
//}

public class example{
    public static void main(String[] args) {
        b a = new b();
        a.c=7;
        a.a=5;
        System.out.println(a.a);
    }
}
