//https://leetcode.com/problems/search-insert-position/
public class search_insert_position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end - start) / 2;
                if(arr[mid]==target){
                    return mid;
                }
                if(arr[mid]>target){
                    end = end - 1;
                }
                if(arr[mid]<target){
                    start = mid + 1;
                }
            }
            return start;
        }
}

