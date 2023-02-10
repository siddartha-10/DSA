import java.sql.SQLOutput;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class Find_kth_bit_in_nth_binary_string {
    public static void main(String[] args) {
        int n = 3;
        String s = "0";
        int index = 3;
        System.out.println(bin(n,index));
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
//
//    public static String bin(int n,String s){
//        if(n==1){
//            return s;
//        }
//        String a = invert(s);
//        s = s+ "1" + reverse(a);
//        return bin(n-1,s);
//    }
//
//    public static String reverse(String x){
//        if(x.isEmpty()){
//            return x;
//        }
//        return reverse(x.substring(1)) + x.charAt(0);
//    }
//    public static String invert(String x){
//        String inv = "";
//        for(int i=0;i<x.length();i++){
//            if(x.charAt(i)=='1'){
//                inv = inv+'0';
//            }
//            else{
//                inv = inv+'1';
//            }
//        }
//        return inv;
//    }

}
