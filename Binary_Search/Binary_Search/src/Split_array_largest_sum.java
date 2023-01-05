public class Split_array_largest_sum {
    public static void main(String[] args) {
        // Here what we have to do is to split the array in 'M' times and then take all the
        // possibilites of them then return the lowest sum of all the sub-arrays
        int[] arr = {7,2,5,8,10};
        int k = 2;
        System.out.println(splitArray(arr,k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i=0;i< nums.length;i++){
            start = Math.max(start,nums[i]);
            end = end + nums[i];
        }

        //binary search
        while(start<end){
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            //calculate how many pieces we can divide this with max sum.
            int sum = 0;
            int pieces = 1;
            for(int num:nums){
                if(sum+num>mid){
                    // you cannot add this in subarray as it excceds the sum>mid
                    // then add sum = num.
                    sum = num;
                    pieces = pieces + 1;
                }
                else{
                    sum = sum + num;
                }
            }
            if(pieces>k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start; // or end as they both are equal
    }
}
