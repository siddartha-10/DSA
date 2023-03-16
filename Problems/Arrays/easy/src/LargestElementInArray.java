// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, -100};
        int large = -10;
        for (int i = 0; i < arr.length; i++) {
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}