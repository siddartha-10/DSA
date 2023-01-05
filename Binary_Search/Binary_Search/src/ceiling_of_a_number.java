public class ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        int a = ceiling(arr,target);
        System.out.println(a);
    }
    // smallest number greater than equal to the target
    static int ceiling(int[] arr,int target){

        // what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return arr[0];
        }

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start) / 2;
            if(arr[middle]==target){
                return arr[middle];
            }
            else if (arr[middle]>target) {
                end = middle - 1;
            }
            else if (arr[middle]<target) {
                start = middle + 1;
            }
        }
        return arr[start];
    }
}
