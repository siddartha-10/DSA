// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Steps_Required_To_make_a_number_zero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(10));
        System.out.println(numberOfSteps(1));
    }

    public static int numberOfSteps(int num) {
        return helper(num,0);
    }

    public static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        n=n-1;
        return helper(n,steps+1);
    }

}
