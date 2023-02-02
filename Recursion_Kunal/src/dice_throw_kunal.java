import java.util.ArrayList;

public class dice_throw_kunal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ArrayList<Integer> ans = new ArrayList<>();
        comb(0,4,arr,ans);
    }

    public static void comb(int index, int target, int[] arr, ArrayList<Integer> ans){
        if(index==arr.length) {
            if (target == 0) {
                System.out.println(ans);
            }
            return;
        }
        if(arr[index]<=target){
            ans.add(arr[index]);
            comb(index, target - arr[index], arr, ans);
            ans.remove(ans.size() - 1);
        }
        comb(index+1,target,arr,ans);
    }
}
