import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/
public class subset_sum_2_striver_leetcode_90 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a = new ArrayList<>();
        combinations(nums,0,a,new ArrayList<>());
        return a;
    }

    public static void combinations(int[] arr,int index,List<List<Integer>> ans,ArrayList<Integer> b){
        ans.add(new ArrayList<>(b));
        for (int i = index; i <arr.length ; i++) {
            if(i!=index && arr[i]==arr[i-1]){
                continue;
            }
            b.add(arr[i]);
            combinations(arr,i+1,ans,b);
            b.remove(b.size()-1);
        }
    }

}
