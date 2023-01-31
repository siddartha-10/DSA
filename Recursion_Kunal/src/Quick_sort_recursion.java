import java.util.Arrays;

public class Quick_sort_recursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        quick_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int low, int high){ // low and high are there to see what part of the array we are working on
        if(low>=high){
            return;
        }
        int start = low; // the start and the mid are used to swapping the number.
        int end = high;
        int mid = start + (end-start) / 2; // this is used to take the pivot element.

        int pivot = arr[mid];
        while(start<=end){
            while(arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if(start<=end){
                int temp  = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // now pivot is in the correct index hence what we do is to make the array into 2 parts.
        quick_sort(arr,low,end);
        quick_sort(arr,start,high);

    }

}
