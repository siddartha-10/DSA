//https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargestElementWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 45, 1};
        System.out.println(second_largest(arr));
    }

    public static int second_largest(int[] arr){
        int first = arr[0];
        int second = -10;
        // to calculate the max of an array
        for (int i = 0; i < arr.length; i++) {
            if(first<arr[i]){
                first = arr[i];
            }
        }
        // now we have first try to get second
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=first && second<arr[i]){
                second = arr[i];
            }
        }
        return second;
    }
}
