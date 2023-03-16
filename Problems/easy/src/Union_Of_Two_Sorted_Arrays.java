import java.util.*;

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
public class Union_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3,6};
        //brute_force(arr1,arr2);
        System.out.println(optimal_solution(arr1,arr2));

    }

    private static ArrayList<Integer> optimal_solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0; // this is the pointer for the first array
        int j = 0; // this is the pointer for the second array
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
            }
            else{
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<arr1.length){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                arr.add(arr1[i]);
            }
            i++;
        }

        while(j<arr2.length){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                arr.add(arr2[j]);
            }
            j++;
        }
        return arr;
    }

    private static void brute_force(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        int[] union = new int[hs.size()];
        Iterator<Integer> it = hs.iterator();
        int i = 0;
        while(it.hasNext()){
            union[i++] = it.next();
        }
        System.out.println(Arrays.toString(union));
    }
}
