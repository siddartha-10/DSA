public class sum_of_first_N_numbers_striver {
    public static void main(String[] args) {
        int n = 5;
        //sum(5,0);
        System.out.println(sum1(5));
    }

    // this is the parameterized way of doing it.
    public static void sum(int n,int summ){
        if(n<1){
            System.out.println(summ);
            return;
        }
        sum(n-1,summ+n);

    }

    // this is the functional way of doing it.
    public static int sum1(int n){
        if(n==0){
            return 0;
        }
        return n + sum1(n-1);
    }

}
