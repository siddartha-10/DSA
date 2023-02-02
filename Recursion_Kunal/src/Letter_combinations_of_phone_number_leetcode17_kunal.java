import java.util.ArrayList;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class Letter_combinations_of_phone_number_leetcode17_kunal {
    public static void main(String[] args) {
        String digits = "";
//        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        combi(arr,"",digits);
        System.out.println(letterCombinations(digits));
    }

    public static ArrayList<String> letterCombinations(String digits){
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(combi(arr,"",digits));
        return list;
    }
    public static ArrayList<String> combi(String[] letters,String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        String a = letters[digit];
        for (int i = 0; i < a.length(); i++) {
            list.addAll(combi(letters,p+a.charAt(i),up.substring(1)));
        }
        return list;
    }

}

//    public static void combinations(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//        for (int i = (digit-1)*3; i < digit*3; i++) {
//            char ch = (char)('a'+i);
//            combinations(p+ch,up.substring(1));
//        }
//    }
//
//    public static ArrayList<String> combi(String p ,String up){
//        if(up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        int digit = up.charAt(0) - '0';
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = (digit-1)*3; i < digit*3; i++) {
//            char ch = (char)('a'+i);
//            list.addAll(combi(p+ch,up.substring(1)));
//        }
//        return list;
//    }

