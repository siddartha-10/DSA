import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> a1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                a1.add(i+1);
            }
        }
        System.out.println(a1);
    }

    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
                i=0;
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
