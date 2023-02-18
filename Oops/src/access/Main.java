package access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Messi");
        // we cannot acess the num varibale because it is private hence
        // what we do to access them is by setter or getter and we need make the getter or setter method public
        // so we can access them outside the class.
        System.out.println(obj.getNum());
    }
}
