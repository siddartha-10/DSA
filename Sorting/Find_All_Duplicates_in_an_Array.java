import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> a1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                a1.add(arr[i]);
            }
        }
        System.out.println(a1);
    }

    public static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
