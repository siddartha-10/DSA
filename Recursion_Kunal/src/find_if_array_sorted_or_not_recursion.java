public class find_if_array_sorted_or_not_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sorted_recur(arr,0));
    }

    // non recursive solution
    public static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    // recursive solution.
    public static boolean sorted_recur(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1] && sorted_recur(arr,index+1));
    }

}
