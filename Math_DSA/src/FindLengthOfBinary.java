// given an integer what is the lenght of it's binary
public class FindLengthOfBinary {
    public static void main(String[] args) {
        int number  = 10;
        int base = 2;
        System.out.println(length_using_formula(number,base));
        //System.out.println(len(8));
    }

    // using formula
    public static int length_using_formula(int number,int base){
        int len = (int)(Math.log(number)/Math.log(base)) + 1;
        return len;
    }
    // way 2 using the right shift operator
    public static int len(int n){
        int l = 0;
        while(n>0){
            l++;
            n = n>>1;
        }
        return l;
    }

}
