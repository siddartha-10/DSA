// https://leetcode.com/problems/power-of-two/description/
public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(10));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        return solve(n);
    }

    public static boolean solve(int n){
        if(n==1){
            return true;
        }
        if(n%2!=0){return false;}
        return solve(n/2);
    }

}
