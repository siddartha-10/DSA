import java.util.Scanner;
public class Program03 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner name2 = new Scanner(System.in);
        Scanner earned_runs = new Scanner(System.in);
        Scanner innings = new Scanner(System.in);
        String FirstName;
        System.out.print("Pitcher's first name: ");
        FirstName = name.next();
//1st name//
        String LastName;
        System.out.print("Pitcher's last name: ");
        LastName = name2.next();
//Last//
        int eRuns;
        System.out.print("Number of earned runs: ");
        eRuns = earned_runs.nextInt();
//runs//
        int innings_2;
        System.out.print("Number of innings pitched: ");
        innings_2 = innings.nextInt();
//innings//
        double ERA = (eRuns * 9.0)/innings_2;
        System.out.print(FirstName+ " " + LastName + " has an ERA of " +ERA);
        name.close();
        earned_runs.close();
        innings.close();
    }
}