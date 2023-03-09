
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner (System.in);
// String inputs
        System.out.println("Pitcher's first name: ");
        String fn = stdIn.next(); // this stores the next input as the firstname as a string
        System.out.println("Pitcher's last name: ");
        String ln = stdIn.next(); // this stores the next input as the lastname as a string
// Int inputs
        System.out.println("Earned runs: ");
        int runs = stdIn.nextInt(); // stores next input as number of earnedruns as an Int variable
        System.out.println("Innings pitched: ");
        int inns = stdIn.nextInt(); // stores next input as number of inningspitched as an Int variable
// Calculation
        double ERA = (double)(runs*9)/inns;
// Output
        System.out.println("Pitcher's name: " + fn + " " + ln);
        System.out.println("Earned runs: " +runs);
        System.out.println("Pitched innings: " + inns);
        System.out.printf("\nERA: %.3f", ERA);
    }
}