// https://leetcode.com/problems/find-in-mountain-array/

public class find_in_moutain_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int a = peak_opt(arr);
        int min1 = orderAgnosticBS(arr,target,0,a);
        if(min1!=-1){
            return min1;
        }
        else {
            return orderAgnosticBS(arr,target,a+1,arr.length);
        }
    }
    public static int peak_opt(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
        return start; // this gives the exact peak element.
        // return start This gives the index of the peak element.
    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end){

        //find whether the array is in ascending or descending order

        while (start <= end) {
//            int mid = (start+end)/2 //might be possible that start+end might excced the integer range
            int mid = start + (end - start) / 2;
            // even the array is agnostic but if the middle is the answer then return mid index.
            if (arr[mid] == target) {
                return mid;
            }
            boolean isASC = arr[start] < arr[end];
            if (isASC) {
                if (target < arr[mid]) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
