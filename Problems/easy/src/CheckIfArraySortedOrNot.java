// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
public class CheckIfArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println(arraySortedOrNot(arr,n));
    }
   public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
}
