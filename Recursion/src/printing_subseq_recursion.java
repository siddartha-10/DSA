import java.util.ArrayList;
import java.util.Arrays;

public class printing_subseq_recursion {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        printsub(0,arr,list,arr.length);
    }

    public static void printsub(int index, int[] arr, ArrayList<Integer> a,int n){
        if(index>=n){
            System.out.println(a);
            return;
        }
        a.add(arr[index]);
        printsub(index+1,arr,a,n);
        a.remove(a.size()-1);
        printsub(index+1,arr,a,n);
    }

}
