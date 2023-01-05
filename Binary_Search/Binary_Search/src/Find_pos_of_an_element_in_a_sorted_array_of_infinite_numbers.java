public class Find_pos_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 30;
        int a = ans(arr,target);
        System.out.println(a);
    }
    static int ans(int[] arr, int target){
        // find the range
        //first start with box of size 2
        int start = 0;
        int end = 1;
        int answer = -1;
        // conditon for the target to lie in the range
        while(arr[end]<target){
            int newstart = end + 1;
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        answer = binarysearch(arr,target,start,end);
        return answer;
    }
    static int binarysearch(int[] arr,int target,int start,int end){
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
