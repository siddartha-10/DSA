public class Recursion_bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(bs(arr.length,c,arr));
    }

    public static void bs(int r, int c,int[] arr){
        if(r==0){
            return;
        }
        if(r>c){
            swap(c,c+1,arr);
            bs(r,c-1,arr);
        }
        else{
            bs(r-1,c,arr)
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
