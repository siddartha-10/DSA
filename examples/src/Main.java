import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(perm(arr));
    }

    public static List<List<Integer>> perm(int[] arr){
        List<Integer> b = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();
        boolean[] brr = new boolean[arr.length];
        permu(arr,brr,b,a);
        return a;
    }

    public static void permu(int[] arr,boolean[] brr,List<Integer> b,List<List<Integer>> a){
        if(b.size()==arr.length){
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(brr[i]==false){
                brr[i] = true;
                b.add(arr[i]);
                permu(arr,brr,b,a);
                b.remove(b.size()-1);
                brr[i] = false;
            }
        }
    }

}