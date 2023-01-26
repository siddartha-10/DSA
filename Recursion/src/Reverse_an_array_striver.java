import java.util.Arrays;

public class Reverse_an_array_striver {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //reverse_using_for_loop(arr);
        reverse_using_recursion(arr,0,arr.length-1);
    }

    // this method is array using recurison

    public static void reverse_using_recursion(int[] arr,int fp,int lp){
        if(fp>lp){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr,fp,lp);
        reverse_using_recursion(arr,fp+1,lp-1);
    }

    // this method is array using a loop and 2 pointer method
    public static void reverse_using_for_loop(int[] arr){
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            swap(arr,a,b);
            a++;
            b--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
