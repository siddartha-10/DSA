import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm
public class Left_Rotate_The_array_by_N {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 22;

        // left rotate it by one means
        // output :- {2,3,4,5,1}
        //brute_force(arr,k);
        optimal_solution(arr,k);
    }

    private static void brute_force(int[] arr,int k) {
        while(k>0){
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal_solution(int[] arr,int k){
        k = k%arr.length;
        // storing the K elements in a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // now swap the remaning element to the front of the array
        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        // now add the elements in temp to the back of the array
        int j = 0;
        for (int i = arr.length-k; i < arr.length; i++) {
            arr[i] = temp[j++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
