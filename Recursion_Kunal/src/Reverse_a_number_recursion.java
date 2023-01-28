public class Reverse_a_number_recursion {
    public static void main(String[] args) {
        int n = 1824;
        rev(n);
        System.out.println(sum);
    }
// way 1 take the number outside.
    static int sum = 0;
    public static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev(n/10);
    }

}