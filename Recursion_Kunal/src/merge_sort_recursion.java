import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class merge_sort_recursion {
    public static void main(String[] args) {
        int[] arr = {8,3,4,6,5,12};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] right = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] left = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(right,left);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // now we may have an few elements left in either of the arrays.
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
