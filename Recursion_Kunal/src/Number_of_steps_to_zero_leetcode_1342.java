public class Number_of_steps_to_zero_leetcode_1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
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


