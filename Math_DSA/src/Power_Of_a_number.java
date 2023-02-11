public class Power_Of_a_number {
    public static void main(String[] args) {
        System.out.println(power(3,6));
    }

    public static int power(int base,int pow){
        int ans = 1;
        while(pow>0){
            if((pow&1)==1){
                ans = ans * base;
            }
            base = base * base;
            pow = pow>>1;
        }
        return ans;
    }

}
