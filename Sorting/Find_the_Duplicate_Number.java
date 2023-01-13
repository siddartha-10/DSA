import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/
public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(arr[i]);
            }
        }
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
