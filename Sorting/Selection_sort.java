import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxNum = getmax(arr,0,last);
            swap(arr,maxNum,last);
        }
    }

    public static void swap(int[] arr, int maxNum, int last) {
        int a = arr[maxNum];
        arr[maxNum] = arr[last];
        arr[last] = a;
    }


    public static int getmax(int[] arr, int start, int last) {
        int temp = start;
        for(int j=start;j<=last;j++){
            if(arr[temp]<arr[j]){
                temp = j;
            }
        }
        return temp;
    }
}
