public class Sum_of_nth_row_in_pascals_triangle {
    public static void main(String[] args) {
        System.out.println(sum2(6));
    }

    // this is using the formula
    public static int sum2(int n){
        return (int)(Math.pow(2,n-1));
    }


    // this is sum of that particular row using left shift operator
    public static int sum(int n){
        int a =0;
        return a+(1<<(n-1));
    }

    // sum of row's from 0 to n-1
    public static int sum1(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (1<<i);
        }
        return sum;
    }

}
