// https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number
public class Find_Missing_Number_in_Array {
    public static void main(String[] args) {
        int[] A = {2, 5, 3, 1};
        int N = 5;
        //System.out.println(MissingNumber(A,N));
        System.out.println(Linearsearch(A,N));
    }

    private static int Linearsearch(int[] a, int n) {
        for (int i = 1; i <=n; i++) {
            boolean num = false;
            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                    num = true;
                    break;
                }
            }
            if(num!=true){
                return i;
            }
        }
        return -1;
    }

    // this is the mathematical solution
    private static int MissingNumber(int[] a, int N) {
        int n = N * (N+1) / 2;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum+=a[i];
        }
        return n-sum;
    }

    // this is
}
