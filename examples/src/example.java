import java.sql.SQLOutput;
import java.util.*;
public class example {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String bitString = "";
        int resultSoFar = 0;
        int userInput = -1;
        while (userInput != 2) {
            userInput = -1;
            if (bitString.length() > 0) {
                System.out.println(bitString);
                System.out.println();
            }
            System.out.println("0 -> Shift Left, Add 0");
            System.out.println("1 -> Shift Left, Add 1");
            System.out.println("2 -> Exit, Evaluate");
            System.out.println();
            while (!(userInput > -1 && userInput < 3)) {
                System.out.print("Choose an operator from the menu above : ");
                        userInput = stdIn.nextInt();
            }
            System.out.println();
            if (userInput == 0) {
                bitString = bitString + "0";
                resultSoFar = 2 * resultSoFar + 0;
            } else if (userInput == 1) {
                bitString = bitString + "1";
                resultSoFar = 2 * resultSoFar + 1;
                System.out.println(bitString + " = " + resultSoFar);
            }
        }
        System.out.println(bitString + " = " + resultSoFar);
        stdIn.close();
    }
}
