import java.util.ArrayList;
import java.util.List;

public class permutations_striver_leetcode_46_using_swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(perm(arr));
    }

    public static List<List<Integer>> perm(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr,0,ans);
        return ans;
    }

    public static void permutations(int[] arr,int index,List<List<Integer>> ans){
        if(index==arr.length){
            ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i,index,arr);
            permutations(arr,index+1,ans);
            swap(i,index,arr);
        }
    }

    public static void swap(int i,int index,int[] arr){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

}
