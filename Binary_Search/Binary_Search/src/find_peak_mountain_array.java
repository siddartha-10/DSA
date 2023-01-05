//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
//https://leetcode.com/problems/find-peak-element/
public class find_peak_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        int[] arr1 = {0,2,1,0};
        System.out.println(peak(arr));
        System.out.println(peak(arr1));
        System.out.println(peak_opt(arr));
    }
    // brute force technique
    public static int peak(int[] arr){
        int ans = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    //optmised using binary search
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
        return arr[start]; // this gives the exact peak element.
        // return start This gives the index of the peak element.
    }
}
