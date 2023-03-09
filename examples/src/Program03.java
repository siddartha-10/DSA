import java.util.Scanner;
public class Program03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //      Input
        System.out.print("Enter the Pitcher's First Name: ");   //  Inputting FirstName
        String FirstName = stdIn.next();
        System.out.print("Enter the Pitcher's Last Name: ");    //  Inputting Last Name
        String LastName = stdIn.next();
        int runs;         //  Declaring variables & inputting numbers
        int innings;
        System.out.print("Number of earned runs: ");
        runs = stdIn.nextInt();
        System.out.print("Number of innings pitched: ");
        innings = stdIn.nextInt();
        Double r = Double.valueOf(runs);        //  Converting int to double
        Double i = Double.valueOf(innings);
        double ERA;
        ERA = r*9 / i;                          //Formula to get ERA
//      Output
        System.out.println('\n' + "Pitcher's First Name: " + FirstName);
        System.out.print("Pitcher's Last Name: " + LastName);
        System.out.print('\n' + "Number of earned runs: " + runs);
        System.out.print('\n' + "Number of innings pitched: " + innings);
        System.out.print('\n' + FirstName + '\t' + LastName + " has an ERA of " + ERA);
        stdIn.close();
    }
}