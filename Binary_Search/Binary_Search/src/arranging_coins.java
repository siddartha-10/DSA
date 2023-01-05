//https://leetcode.com/problems/arranging-coins/
public class arranging_coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(7));
    }
    // not optimised solution
    public static int arrangeCoins(int n) {
        int coins = n;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(coins>=i){
                coins = coins - i;
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
