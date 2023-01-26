import java.util.Arrays;

// https://leetcode.com/problems/sorting-the-sentence/
public class Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println();
        String[] arr1 = s.split(" ");
        //System.out.println(Arrays.toString(arr1));
        String[] arr = new String[arr1.length];
        for (String a:arr1){
            int index = Character.getNumericValue(a.charAt(a.length()-1));
            arr[index-1] = a.substring(0,a.length()-1);
        }
        System.out.println(Arrays.toString(arr));
    }

//    public static String sortSentence(String s) {
//        String[] arr1 = s.split(" ");
//        String[] arr = new String[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr[arr1[i].charAt(arr1[i].length()-1)] = "1";
//        }
//        return Arrays.toString(arr);
//    }

}
