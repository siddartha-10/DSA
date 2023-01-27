import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/subset-sums2234/1
public class subset_sum_striver_gfg {
    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> b = new ArrayList<>();
//        combinations(0,arr.size(),arr,0,b);
        System.out.println(subsetSums(arr,arr.size()));
    }

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList < Integer > sumSubset = new ArrayList < > ();
        combinations(0,N, arr,0,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;

    }

    public static void combinations(int ind,int N,ArrayList<Integer> arr, int sum, ArrayList<Integer> sumsubset){
        if(ind==N){
            sumsubset.add(sum);
            return;
        }
        combinations(ind+1,N,arr,sum+arr.get(ind),sumsubset);
        combinations(ind+1,N,arr,sum,sumsubset);
    }

}
