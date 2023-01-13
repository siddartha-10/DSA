import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int[] arr){
        // we will move i only if the element is in the correct index
        int i=0;
        while(i<arr.length){
            if(arr[i]-1!=i){
                swap(arr,i,arr[i]-1);
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
