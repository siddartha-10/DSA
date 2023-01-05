public class floor_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int a = floor(arr, target);
        System.out.println(a);
    }
    // largest number less than equal to the target
    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return arr[middle];
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            }
        }
        return end;
    }
}
