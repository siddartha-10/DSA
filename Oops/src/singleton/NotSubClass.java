package singleton;
import access.A;
public class NotSubClass {
    public static void main(String[] args) {
        NotSubClass obj = new NotSubClass();
        //int n = obj.num; // we are not able to access the protected varibale from not a subclass in different package
    }
}
