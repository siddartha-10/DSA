public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(max<count){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
