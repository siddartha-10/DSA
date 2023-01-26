import java.util.Arrays;

// https://leetcode.com/problems/sorting-the-sentence/
public class Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }

    public static String sortSentence(String s) {
        String[] arr1 = s.split(" ");
        String[] arr = new String[arr1.length];
        String c = "";
        for (String a:arr1){
            int index = Character.getNumericValue(a.charAt(a.length()-1));
            arr[index-1] = a.substring(0,a.length()-1);
        }
        for (int i = 0; i < arr.length-1; i++) {
            c+=arr[i]+" ";
        }
        c+=arr[arr.length-1];
        return c;
    }

}
