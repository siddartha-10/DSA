import java.util.Arrays;

public class MoveAllZeroesToEndofArray {
    public static void main(String[] args) {
        int[] arr = {15,12,0,0,0,2,2,19,6,17,16,20,0,2,16,0,10,0,14,15};
        //brute_force(arr);
        optimal_solution(arr);
    }

    private static void optimal_solution(int[] arr) {
        // step1 : to find the first occurance of zero
        int j = 0;
        while(true){
            if (arr[j]!=0){
                j++;
            }
            else{
                break;
            }
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
