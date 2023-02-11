public class Find_number_of_set_bits {
    public static void main(String[] args) {
        System.out.println(length(1));
        System.out.println(setBits(45));
    }

    // this is one way to get the number of set bits
    public static int length(int num){
        int len = 0;
        while (num > 0){
            if((num&1)==1){
                len++;
            }
            num = num >> 1;
        }
        return len;
    }

    // way 2 to get the number of set bits

    public static int setBits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n - (n & -n);
        }
        return count;
    }

}
