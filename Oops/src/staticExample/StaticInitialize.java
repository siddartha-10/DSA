package staticExample;

public class StaticInitialize {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am inside the static block to initialise the variables");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInitialize obj  = new StaticInitialize();
        System.out.println(obj.a+ "    "+obj.b);
    }
}
