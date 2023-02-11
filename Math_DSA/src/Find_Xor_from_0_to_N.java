public class Find_Xor_from_0_to_N {
    public static void main(String[] args) {
        System.out.println(xor(32));
    }

    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    }

}
