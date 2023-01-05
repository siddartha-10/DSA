import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args){
        int[] arr = {3,1,4,2,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        // for n-1 runs
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            //each step
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
