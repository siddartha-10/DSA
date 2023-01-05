public class order_agnostic_binary_search {
    public static void main(String[] args) {
        //int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int a = orderAgnosticBS(arr,target);
        System.out.println(a);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is in ascending or descending order

        while (start <= end) {
//            int mid = (start+end)/2 //might be possible that start+end might excced the integer range
            int mid = start + (end - start) / 2;
            // even the array is agnostic but if the middle is the answer then return mid index.
            if (arr[mid] == target) {
                return mid;
            }
            boolean isASC = arr[start] < arr[end];
            if (isASC) {
                if (target < arr[mid]) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
