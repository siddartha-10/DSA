//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(search_ele(arr,target));
    }
    public static int search_ele(int[] arr,int target){
        int pivot = findpivot(arr);
        // if you do not find a pivot, it means that the array is not rotated
        if(pivot == -1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        // if pivot is found we have 2 ascending sorted arrays
        // 3 cases
        if(arr[pivot]==target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarysearch(arr,target,0,pivot-1);
        }
        else{
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
    }
    // this will not work for duplicate values.
    public static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            //4 cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            else if (arr[start]>=arr[mid]) {
                end = mid - 1;
            }
            else if (arr[start]<arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
//            int mid = (start+end)/2 //might be possible that start+end might excced the integer range
            int mid = start + (end-start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
