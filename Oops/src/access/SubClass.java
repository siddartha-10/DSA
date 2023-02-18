package access;
public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(20,"Lionel");
        int n = obj.num; // this is a subclass we can access the protected in the same package
        
    }

}
