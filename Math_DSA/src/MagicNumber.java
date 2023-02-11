public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magic(6));
    }

    public static int magic(int n){
        int a = 0;
        int c=1;
        while(n>0){
            int b = n&1;
            n = n>>1;
            a = a + b * (int)(Math.pow(5,c));
            c++;
        }
        return a;
    }

}
