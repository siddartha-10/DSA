// https://leetcode.com/problems/power-of-four/description/
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
    }

    public static boolean isPowerOfFour(int n) {
        return solve(n);
    }

    public static boolean solve(int n){
        if(n==1){
            return true;
        }
        if(n%4!=0 || n<=0){
            return false;
        }
        return solve(n/4);
    }

}
