import java.util.Scanner;

public class Perfect_square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
    }

    public static int binary(int n){
        int start = 0;
        int end = n;
        while(end>start){
            int mid = start + (end - start) / 2;
            if(mid*mid==n){
                return mid;
            }
            else if (mid*mid>n) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

}
