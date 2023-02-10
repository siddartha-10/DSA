public class ResetIthBit {
    public static void main(String[] args) {
        System.out.println(reset(5,1));
    }

    public static int reset(int i,int n){
        return i&~(1<<(n-1));
    }

}
