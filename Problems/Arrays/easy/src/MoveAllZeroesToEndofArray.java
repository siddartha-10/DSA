import java.util.Arrays;

public class MoveAllZeroesToEndofArray {
    public static void main(String[] args) {
        int[] arr = {15,12,0,0,0,2,2,19,6,17,16,20,0,2,16,0,10,0,14,15};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
