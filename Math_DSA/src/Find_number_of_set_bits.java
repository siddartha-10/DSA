public class Find_number_of_set_bits {
    public static void main(String[] args) {
        System.out.println(length(1));
    }

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

}
