import java.util.ArrayList;

public class Linear_search_recursion {
    public static void main(String[] args) {
        int[] arr = {2,4,99,2,1};
        int target = 99;
//        ls(arr,target,0);
//        System.out.println(ans);
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(ls2(arr,target,0));
    }

    public static boolean linear_search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){return true;}
        return linear_search(arr,target,index+1);
    }

    // when we find a target then add it to the array list

    static ArrayList<Integer> ans = new ArrayList<>();
    public static void ls(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        ls(arr,target,index+1);
    }

    // returning an array list that contains the index of the targets.

    public static ArrayList<Integer> ls1(int[] arr,int target,int index,ArrayList<Integer> b){
        if(index==arr.length){
            return b;
        }
        if(arr[index]==target){
            b.add(index);
        }
        return ls1(arr,target,index+1,b);
    }

    // when you want to return the list but without passing it as an argument

    public static ArrayList<Integer> ls2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans = ls2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }

}
