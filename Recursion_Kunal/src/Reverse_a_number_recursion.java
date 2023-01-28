public class Reverse_a_number_recursion {
    public static void main(String[] args) {
        int n = 1824;
        //rev(n);
        //System.out.println(sum);
        System.out.println(rev2(n));

    }
/*
 way 1 take the number outside.
    static int sum = 0;
    public static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev(n/10);
    }
 way 2
*/

    public static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        System.out.println(digits);
        return helper(n,digits);
    }

    public static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

}