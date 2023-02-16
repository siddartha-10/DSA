package staticExample;

class Test {
    static String name;
    public Test(String name){
        Test.name = name;
    }

}
public class InnerClass {
    public static void main(String[] args) {
        Test a = new Test("Cris");
        Test b = new Test("messi");

        // the below 2 lines will print messi because the above class which is Test has put the string name to static
        // hence when first time the line is run then the name will be "cris" but then when the b object is created an run
        // then the name will as messi and both the objects(a,b) will now print as messi.
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
