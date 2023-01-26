import java.util.*;

public class combination_sum_2_striver_leetcode_40 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int target = 4;
        System.out.println(combinationSum2(arr,target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    public static void combination(int index, int[] arr, int target,List<List<Integer>> ans,List<Integer> b){
        Arrays.sort(arr);
        // base condition
        if(target==0){
            ans.add(new ArrayList<>(b));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            b.add(arr[i]);
            combination(i+1,arr,target-arr[i],ans,b);
            b.remove(b.size()-1);
        }
    }

}
