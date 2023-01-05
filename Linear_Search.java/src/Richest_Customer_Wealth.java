// https://leetcode.com/problems/richest-customer-wealth/
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int row = 0;row<accounts.length;row++){
            for(int col=0;col<accounts[row].length;col++){
                int a = sumofarray(accounts[row]);
                if(a>max){
                    max = a;
                }
            }
        }
        return max;
    }
    static int sumofarray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
