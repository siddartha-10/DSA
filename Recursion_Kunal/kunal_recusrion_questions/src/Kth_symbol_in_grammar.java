// https://leetcode.com/problems/k-th-symbol-in-grammar/description/
public class Kth_symbol_in_grammar {
    public static void main(String[] args) {
        System.out.println(bin(2,1));
    }

    public static int bin(int n,int k){
        boolean isZero = true;
        int mid =(int)Math.pow(2,n-1)/2;
        while(n>1){
            if(k>mid){
                isZero = !isZero;
                k = k -mid;
            }
            n--;
            mid = mid /2;
        }
        return isZero?0:1;
    }

}
