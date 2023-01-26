import java.lang.reflect.Array;
import java.util.ArrayList;

public class print_only_one_subseq_sum_is_k_striver {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        printsub(0,a,0,k,arr,n);
    }

    public static boolean printsub(int index, ArrayList<Integer> a,int sum,int k,int[] arr,int n){
        if(index==n){
            // condition statisfied
            if(sum==k){
                System.out.println(a);
                return true;
            }
            // condition not statisfied
            else{
                return false;
            }
        }
        a.add(arr[index]);
        sum+=arr[index];
        if(printsub(index+1,a,sum,k,arr,n)==true){
            return true;
        }
        a.remove(a.size()-1);
        sum-=arr[index];
        if(printsub(index+1,a,sum,k,arr,n)==true){
            return true;
        }
        return false;
    }

}
