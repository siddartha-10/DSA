import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_subset_kunal {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> b = new ArrayList<>();
        subset(arr,0,b);
    }

    public static void subset(int[] arr, int index,ArrayList<Integer> b){
        if(index==arr.length){
            System.out.println(b);
            return;
        }
        b.add(arr[index]);
        subset(arr,index+1,b);
        b.remove(b.size()-1);
        subset(arr,index+1,b);
    }

}
