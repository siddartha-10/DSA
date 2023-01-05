public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,40};
        int target = 20;
        int a = binarysearch(arr,target);
        System.out.println(a);
    }

    // return the index
    // reutrn -1 if it doesnt not exists
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
//            int mid = (start+end)/2 //might be possible that start+end might excced the integer range
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}