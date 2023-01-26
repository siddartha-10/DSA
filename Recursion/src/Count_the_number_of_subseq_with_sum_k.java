import java.util.ArrayList;

public class Count_the_number_of_subseq_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(countseq(0,a,0,k,arr,n));
    }

    public static int countseq(int index, ArrayList<Integer> a,int sum,int k,int[] arr,int n){
        if(index==n){
            if(sum==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        a.add(arr[index]);
        sum+=arr[index];
        int l = 0 ;
        l+=countseq(index+1,a,sum,k,arr,n);
        a.remove(a.size()-1);
        sum-=arr[index];
        int m = 0;
        m+=countseq(index+1,a,sum,k,arr,n);
        return l + m;
    }

}
