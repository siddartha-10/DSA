public class find_rotation_count_in_rotation_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = Countrotations(arr)+1;
        System.out.println(pivot);
    }
    public static int Countrotations(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            //4 cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            else if (arr[start]>=arr[mid]) {
                end = mid - 1;
            }
            else if (arr[start]<arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
