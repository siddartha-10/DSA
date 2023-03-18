public class Longest_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,1,1,1,4,2,3};
        int len = 0;
        int k = 4;
        brute_force(arr,k,len);
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
