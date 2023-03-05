import java.sql.SQLOutput;
import java.util.Scanner;

public class C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        char first = response.charAt(0);
        char second = response.charAt(1);
        char third = response.charAt(2);
        char fourth = response.charAt(3);
        int count_decimal = 0;

        if(first=='.'){
            count_decimal++;
        }
        if(second=='.'){
            count_decimal++;
        }
        if(third=='.'){
            count_decimal++;
        }
        if(fourth=='.'){
            count_decimal++;
        }
        if(count_decimal>1){
            System.out.println("false");
            System.exit(0);
        }

        if(first=='+' || first=='-' || first=='.' || (first>='0' && first<='9')){
            if(second=='.' || (second>='0' && second<='9')){
                if(third=='.' || (third>='0' && third<='9')){
                    if(fourth=='.' || (fourth>='0' && fourth<='9')){
                        System.out.println("true");
                    }
                    else{
                        System.out.println(false);
                    }
                }
                else{
                    System.out.println(false);
                }
            }
            else{
                System.out.println(false);
            }
        }
        else{
            System.out.println(false);
        }
    }
}

