import java.sql.SQLOutput;
import java.util.*;
public class example {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String bitString = ("");
        int resultsofar = 0;
        int input = 0;
        System.out.println("0 => Shift Left, Add 0");
        System.out.println("1 => Shift Left, Add 1");
        System.out.println("2 => Exit, Evaluate");
        while (input == 0 || input == 1 )
        {
            System.out.println("--------------------------------------");
            System.out.println("Choose an operator from the menu above");
            System.out.println("--------------------------------------");
            input=stdIn.nextInt();
            if (input == 1)
            {
                bitString = bitString + 1;
                resultsofar = 2*resultsofar + 1;
                System.out.println(bitString);
            }
            else if (input == 0)
            {
                bitString = bitString + 0;
                resultsofar = 2*resultsofar + 0;
                System.out.println(bitString);
            }
            else if (input == 2)
            {
                System.out.println(bitString + " = " + resultsofar);
            }
        }
    }
}