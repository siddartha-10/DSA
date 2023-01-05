public class LinearSearch_Strings {
    public static void main(String[] args){
        String[] strs = {"ronaldo","neymar","saurez","messi"};
        String target = "messi";
        int a = linear_search(strs,target);
        System.out.println(a);
    }
    static int linear_search(String[] arr,String target){
        if(arr.length == 0 ){
            return -1;
        }
        // run for loop
        for(int index=0;index<arr.length;index++){
            String element = arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if no statement have been executed
        return -1;
    }
}
