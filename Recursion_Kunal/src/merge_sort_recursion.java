import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class merge_sort_recursion {
    public static void main(String[] args) {
        int[] arr = {8,3,4,6,5,12};
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

/*
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
*/


    // merge sort in place
    public static void mergeSortInplace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid = s + (e-s) / 2;
        mergeSortInplace(arr,s,mid);
        mergeSortInplace(arr,mid,e);

        mergeInplace(arr,s,mid,e);
    }

    private static void mergeInplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }

}
