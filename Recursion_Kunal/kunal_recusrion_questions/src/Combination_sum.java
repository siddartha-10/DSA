import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class Combination_sum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        System.out.println(combination_sum(arr,target));
    }

    public static void combi(int[] arr, int index, int target, List<List<Integer>> ans,List<Integer> b){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(b));
            }
            return;
        }
        if(arr[index]<=target){
            b.add(arr[index]);
            combi(arr,index,target-arr[index],ans,b);
            b.remove(b.size()-1);
        }
        combi(arr,index+1,target,ans,b);
    }

    public static List<List<Integer>> combination_sum(int[] arr,int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        combi(arr,0,target,ans,b);
        return ans;
    }


}
