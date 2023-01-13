// https://leetcode.com/problems/set-mismatch/
public class set_mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        cycle(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1!=i){
                System.out.println(arr[i]+" "+(i+1));
            }
        }
    }

    public static void cycle(int[] arr){
        // we will move i only if the element is in the correct index
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
