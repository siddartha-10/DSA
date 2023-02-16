package staticExample;

public class StaticInitialize {
    static int a = 4;
    static int b;

    // the static block will only for one time when the object is created and that's it even if we
    // create new objects it will not run again and again only one time.
    static {
        System.out.println("I am inside the static block to initialise the variables");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInitialize obj  = new StaticInitialize();
        System.out.println(StaticInitialize.a+ "    "+StaticInitialize.b);

        obj.b+=3;


        StaticInitialize obj1 = new StaticInitialize(); // now when the new object is created we can ionly see one entry
        // into the static block
        System.out.println(StaticInitialize.a+ "    "+StaticInitialize.b);

    }
}
