public class Min_number {
    public static void main(String[] args){
        int[] nums = {23,4,5,1,9,-3};
        System.out.println(min(nums));
    }
    static int min(int[] nums){
        int min_element = nums[0];
        for(int i=0;i<nums.length;i++){
            if(min_element>nums[i]){
                min_element = nums[i];
            }
        }
        return min_element;
    }
}
