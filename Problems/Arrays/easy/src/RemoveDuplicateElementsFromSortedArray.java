import java.util.*;
// https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array
public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        //System.out.println(bruteForce(arr));
        System.out.println(optimised_Sol(arr));
    }

    public static int bruteForce(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }
            else{
                hs.put(arr[i],hs.get(arr[i])+1);
            }
        }
        int index = 0;
        for(Integer i : hs.keySet()){
            arr[index] = i;
            index++;
        }
        return index;
    }

    public static int optimised_Sol(int[] arr){
        int i = 0;
        for (int j = 1 ; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
