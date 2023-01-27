import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class permutations_striver_leetcode_46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permutations(nums));
    }

    public static List<List<Integer>> permutations(int[] nums){
        ArrayList<Integer> b = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        perm(nums,arr,ans,b);
        return ans;
    }

    public static void perm(int[] nums,boolean[] arr,List<List<Integer>> ans, List<Integer> b){
        if(b.size()==nums.length){
            ans.add(new ArrayList<>(b));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!arr[i]){
                arr[i] = true;
                b.add(nums[i]);
                perm(nums,arr,ans,b);
                b.remove(b.size()-1);
                arr[i] = false;
            }
        }
    }

}
