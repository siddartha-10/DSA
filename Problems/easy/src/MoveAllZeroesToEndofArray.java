import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array
public class MoveAllZeroesToEndofArray {
    public static void main(String[] args) {
        int[] arr = {15,12,0,0,0,2,2,19,6,17,16,20,0,2,16,0,10,0,14,15};
        //brute_force(arr);
        optimal_solution(arr);
    }

    private static void optimal_solution(int[] arr) {
        // step1 : to find the first occurance of zero
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        // if there are no Zero's in the array then you can just return the same array
        if(j==-1){
            return;
        }
        // step2 : start the iteration from the next element of the zero
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void brute_force(int[] arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
