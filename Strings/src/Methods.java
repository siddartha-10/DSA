import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Lionel Messi";
        System.out.println(Arrays.toString(name.toCharArray())); // this converts an string into a character array.
        System.out.println(name.toLowerCase()); // this converts a string into a lower case.
        System.out.println(name.toUpperCase()); // this converts a string into a upper case.
        System.out.println(name.indexOf('l')); // this gives the first index of a particular character.
        System.out.println("    lionel messi   ".strip()); // this removes the leading and trailing white spaces.
        System.out.println(Arrays.toString(name.split(" "))); // this is used to break the string where there is a space.
    }
}
