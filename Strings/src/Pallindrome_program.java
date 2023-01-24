import java.util.Arrays;

public class Pallindrome_program {
    public static void main(String[] args) {
        String name = "abcdcba";
        char[] arr = name.toCharArray();
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        boolean a = true;
        while(start<=end){
            if(arr[start]==arr[end]){
                start+=1;
                end-=1;
            }
            else{
                a = false;
                break;
            }
        }
        System.out.println(a);
    }
}
