//  https://leetcode.com/problems/valid-perfect-square/
public class valid_perfect_square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(15));
    }
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while(start<=end){
            long mid = start + (end - start) / 2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid<num){
                start = mid + 1;
            }
            if(mid*mid>num){
                end = mid - 1;
            }
        }
        return false;
    }
}
