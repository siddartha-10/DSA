// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


import java.lang.reflect.Array;
import java.util.Arrays;

// brute force one loop from start and another loop from end when we match 7 then break and add to output array.
public class First_and_Last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(binarysearch(arr, target)));
    }
    public static int[] binarysearch(int[] arr,int target){
        int[] ans = {-1,-1};

        // check for the first occurance of target
        int start_value = search(arr,target,true);
        int end_value = search(arr,target,false);

        ans[0] = start_value;
        ans[1] = end_value;

        return ans;
    }
    // this functions returns the index value of target
    public static int search(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
//            int mid = (start+end)/2 //might be possible that start+end might excced the integer range
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
