import java.util.Arrays;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2};
        cyclic(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i) {
                System.out.println(i);
                break;
            }
            else{
                System.out.println(arr.length);
                break;
            }
        }
    }

    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i && arr[i]!=arr.length){
                swap(arr,i,arr[i]);
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
