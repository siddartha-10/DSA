// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(evenornot(i)){
                count++;
            }
        }
        return count;
    }

    static boolean evenornot(int a){
        int num = a;
        int count = 0;
        while(num!=0){
            num=num/10;
            count++;
        }
//        if(count%2==0){
//            return true;
//        }
//        return false;
        return count%2==0;
    }
}
