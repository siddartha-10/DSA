import java.util.ArrayList;
import java.util.List;

public class Combination_sum_1_striver_leetcode_39 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(arr,target));
    }

    public static void combination(int index, int[] arr, int target,List<List<Integer>> a,ArrayList<Integer> b){
        // base condition
        if(index==arr.length){
            if(target==0){
                a.add(new ArrayList<>(b));
            }
            return;
        }
        if(arr[index]<=target){
            b.add(arr[index]);
            combination(index,arr,target-arr[index],a,b);
            b.remove(b.size()-1);
        }
        combination(index+1,arr,target,a,b);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> a = new ArrayList<>();
        combination(0,candidates,target,a,new ArrayList<>());
        return a;
    }
    
}
