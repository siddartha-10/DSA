public class Prime_numbers {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(isPrime1(5));
    }

    // 1st way of solving
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // 2nd way a bit optimised
    public static boolean isPrime1(int n){
        for (int i = 2; i < (int)Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}


