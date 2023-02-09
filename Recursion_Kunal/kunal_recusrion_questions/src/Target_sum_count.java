// https://leetcode.com/problems/target-sum/description/
public class Target_sum_count {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(find(arr,target,0));
    }

    public static int find(int[] nums,int target,int count){
        return calculate(nums,target,0,0,count);
    }
    public static int calculate(int[] nums, int target, int index, int sum,int count){
        if(index==nums.length){
            if(sum==target){
                count++;
            }
            return count;
        }
        int a = calculate(nums, target, index+1, sum+nums[index],count);
        int b = calculate(nums, target, index+1, sum-nums[index],count);
        return a+b;
    }

}
