public class Factors_of_a_number {
    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factors1(20);
    }

    // way-1 brute force approach
    public static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // way-2 optimised solution time complexity is O(sqrt(n))
    public static void factors1(int n){
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" "+n/i+" ");
            }
        }
    }

}
