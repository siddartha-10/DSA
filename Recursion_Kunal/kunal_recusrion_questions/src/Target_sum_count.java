// https://leetcode.com/problems/target-sum/description/
public class Target_sum_count {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(find(arr,target));
    }

    public static int find(int[] nums,int target){
        calculate(nums,target,0,0);
        return count;
    }
    public static int calculate(int[] nums, int target, int index, int sum){
        if(index==nums.length){
            if(sum==target){
                count = count + 1;
            }
        }
        else{
            calculate(nums, target, index+1, sum+nums[index]);
            calculate(nums, target, index+1, sum-nums[index]);
        }
        return count;
    }

}
