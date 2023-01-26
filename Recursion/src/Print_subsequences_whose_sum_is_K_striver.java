import java.util.ArrayList;

public class Print_subsequences_whose_sum_is_K_striver {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> a = new ArrayList<>();
        subseq_sum_K(arr,0,a,arr.length,k);
    }

    public static void subseq_sum_K(int[] arr, int index, ArrayList<Integer> a,int n,int k){
        if(index>=n){
            int sum = 0;
            for (int s:a) {
                sum+=s;
            }
            if(sum==k){
                System.out.println(a);
            }
            return;
        }
        // this is the pick condition
        a.add(arr[index]);
        subseq_sum_K(arr,index+1,a,n,k);
        a.remove(a.size()-1);
        // this is the not pick condition
        subseq_sum_K(arr,index+1,a,n,k);
    }

}
