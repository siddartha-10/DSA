public class LinearSearch_Nums  {
    public static void main(String[] args) {
        int[] nums = {23,4,5,1,9,-3};
        int target = 1;
        int ans = linear_search(nums,target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found
    //otherwise if the item not found return -1
    static int linear_search(int[] arr,int target){
        if(arr.length == 0 ){
            return -1;
        }
        // run for loop
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if no statement have been executed
        return -1;
    }
}