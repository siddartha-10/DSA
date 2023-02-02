import java.util.ArrayList;

public class subset_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        ArrayList<Integer> a = new ArrayList<>();
        subset(arr,0,a);
    }

    public static void subset(int[] arr, int index, ArrayList<Integer> a){
        System.out.println(a);
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]){
                continue;
            }
            a.add(arr[i]);
            subset(arr,i+1,a);
            a.remove(a.size()-1);
        }
    }

}
