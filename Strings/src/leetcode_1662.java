public class leetcode_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(int i=0;i<word1.length;i++){
            s1+=word1[i];
        }
        for(int j=0;j<word2.length;j++){
            s2+=word2[j];
        }
        return s1.equals(s2);
    }

}
