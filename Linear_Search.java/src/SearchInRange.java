public class SearchInRange {
    public static void main(String[] args){
        int[] nums = {23,4,5,1,9,-3};
        int target = 1;
        int start = 1;
        int end = 3;
        int ans = linear_search(nums,target,start,end);
        System.out.println(ans);
    }
    static int linear_search(int[] arr,int target,int start,int end){
        if(arr.length == 0 ){
            return -1;
        }
        // run for loop
        for(int index=start;index<=end;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if no statement have been executed
        return -1;
    }
}
