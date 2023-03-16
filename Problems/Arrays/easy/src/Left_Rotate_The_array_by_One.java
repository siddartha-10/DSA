import java.util.Arrays;

public class Left_Rotate_The_array_by_One {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        // left rotate it by one means
        // output :- {2,3,4,5,1}
        brute_force(arr,k);
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
}
