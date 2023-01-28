public class Rotated_binary_search_recursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(rbs(arr,target,0,arr.length));
    }

    public static int rbs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start) / 2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return rbs(arr,target,start,mid-1);
            }
            else{
                return rbs(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return rbs(arr,target,mid+1,end);
        }
        return rbs(arr,target,start,mid-1);
    }

}
