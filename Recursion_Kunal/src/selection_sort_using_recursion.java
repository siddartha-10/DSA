import java.util.Arrays;

public class selection_sort_using_recursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection_recursion(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection_recursion(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                selection_recursion(arr,r,c+1,c);
            }
            else{
                selection_recursion(arr,r,c+1,max);
            }
        }
        else {
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;
            selection_recursion(arr,r-1,0,0);
        }
    }

}


    /*
    // solution without using recusion

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getmax(arr,0,last);
            swap(arr,max,last);
        }
    }

    private static void swap(int[] arr, int max, int last) {
        int temp  =arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    public static int getmax(int[] arr,int a,int b){
        int temp = a;
        for(int i=a;i<=b;i++){
            if(arr[temp]<arr[i]){
                temp = i;
            }
        }
        return temp;
    }

     */

