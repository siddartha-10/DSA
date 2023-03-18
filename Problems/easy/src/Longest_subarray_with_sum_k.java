import java.util.HashMap;

public class Longest_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int len = 0;
        int k = 3;
        //brute_force(arr,k,len);
        System.out.println(better_sol(arr,k,len));
    }

    private static int better_sol(int[] arr, int k,int len) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // add each element and consider that as the last element.
            if(sum == k){     // now check if the sum is equal to the given target
                if(i+1 > len){
                    len = i+1;
                }
            }
            int remainder_sum = sum - k; //here we are taking the remainder sum and seeing if there is already that sum availble in the hashmap already
            if(hs.containsKey(remainder_sum)){
                int len1 = i - hs.get(remainder_sum);
                if(len1 > len){
                    len = len1;
                }
            }
            hs.put(sum,i);
        }
        System.out.println(hs);
        return len;
    }

    private static void brute_force(int[] arr, int k, int len) {
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0; // initializong sum to zero each time
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum==k){
                    if(len < (j-i+1)){
                        len = (j-i+1);
                    }
                }
                if(sum > k){
                    break;
                }
            }
        }
        System.out.println(len);
    }
}
