import java.util.Arrays;

public class bubble_sort_using_recursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bs(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bs(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]) {
                swap(arr, c, c + 1);
                bs(arr,r,c+1);
            }
        }
        else{
            bs(arr,r-1,0);
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
