import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//
public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        //brute_force(arr1,arr2);
        optimal_sol(arr1,arr2);
    }

    private static void optimal_sol(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        int j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                arr.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(arr);
    }

    private static void brute_force(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr2.length];
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j] && arr3[j]==0){
                    arr.add(arr1[i]);
                    arr3[j] = 1;
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        System.out.println(arr);
    }
}
