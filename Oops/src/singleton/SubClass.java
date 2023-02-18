package singleton;
import access.A;
public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(25,"cristiano");
        int n = obj.num; // we can access the protected varibale that is in a different package.
    }
}
