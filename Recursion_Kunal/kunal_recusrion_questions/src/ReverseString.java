// https://leetcode.com/problems/reverse-string/description/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        swap2(s,0,s.length-1);
    }

    public static void swap2(char[] s,int i,int j){
        if(i>j){
            return;
        }
        swap(s,i,j);
        swap2(s,i+1,j-1);
    }

    public static void swap(char[] s,int i,int j){
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }

}