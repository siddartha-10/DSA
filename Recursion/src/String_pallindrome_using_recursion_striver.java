public class String_pallindrome_using_recursion_striver {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(pallindromeornot(s,0,s.length()-1));
    }

    // this is recursive method
    /* Here what we will do is that we will take two pointers and make sure that the first and the last charcters
    are equal if they are so then we can continue else we can return false.*/

    public static boolean pallindromeornot(String s,int fp,int lp){
        if(fp>lp) {
            return true;
        }
        if(s.charAt(fp)==s.charAt(lp)){
            pallindromeornot(s, fp + 1, lp - 1);
        }
        else{
            return false;
        }
        return true;
    }

}
