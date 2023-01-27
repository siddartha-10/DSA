// https://leetcode.com/problems/permutations-ii/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations_2_striver_leetcode_47 {
    public static void main(String[] args) {
        int[] arr= {1,1,2};
        System.out.println(permuteUnique(arr));

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        perm(nums,0,ans);
        return ans;
    }

    public static void perm(int[] arr,int index,List<List<Integer>> ans){
        if(index==arr.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            swap(i,index,arr);
            perm(arr,index+1,ans);
            swap(i,index,arr);
        }
    }

    public static void swap(int i,int index,int[] arr){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }


}
