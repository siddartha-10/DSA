public class Linear_search_recursion {
    public static void main(String[] args) {
        int[] arr = {2,4,99,2,1};
        int target = 99;
        System.out.println(linear_search(arr,target,0));
    }

    public static boolean linear_search(int[] arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
        if(arr[index]==target){return true;}
        return linear_search(arr,target,index+1);
    }

}
