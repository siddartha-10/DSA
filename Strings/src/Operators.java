import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // this converts characters into integers(ascii values) and do addition
        System.out.println("a"+"b"); // This do string concatenation

        System.out.println("a"+1);
        // When an string is concatenated with an integer then it will be converted into Integer and then it calls toString() method

        System.out.println("Lionel"+ new ArrayList<>());
        /* it will be converted to toString method, and it will print null */
    }
}
