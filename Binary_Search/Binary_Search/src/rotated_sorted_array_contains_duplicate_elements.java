public class rotated_sorted_array_contains_duplicate_elements {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(search_ele(arr,target));
    }
    public static int search_ele(int[] arr,int target){
        int pivot = findpivotwithduplicates(arr);
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
    public static int findpivotwithduplicates(int[] arr){
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
           // if elements at middle, start, end are equal then skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip the duplicates
                //Note: What if the elements at these indices were actually the pivot
                // So lets check
                if(arr[start]>arr[start+1]) {
                    return start;
                }
                start = start + 1;
                // check whether the end is pivot or not
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end = end - 1;
            }// left is sorted, so pivot should be on the right
            else if(arr[start]<arr[mid]||arr[start]==arr[mid] && arr[end]<arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
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
