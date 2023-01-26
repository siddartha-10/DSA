public class leetcode_1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int vow_1 = 0;
        int vow_2 = 0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vow_1+=1;
            }
        }
        for(int j = s.length()/2;j<s.length();j++){
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                vow_2+=1;

            }
        }
        return vow_1==vow_2;
    }

}
