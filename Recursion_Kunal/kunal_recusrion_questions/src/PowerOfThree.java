// https://leetcode.com/problems/power-of-three/description/
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        return solve(n);
    }

    public static boolean solve(int n){
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return solve(n/3);
    }

}
