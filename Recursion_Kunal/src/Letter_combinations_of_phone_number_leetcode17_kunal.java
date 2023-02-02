import java.util.ArrayList;

public class Letter_combinations_of_phone_number_leetcode17_kunal {
    public static void main(String[] args) {
        System.out.println(combi("","12"));
    }

    public static void combinations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            combinations(p+ch,up.substring(1));
        }
    }

    public static ArrayList<String> combi(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            list.addAll(combi(p+ch,up.substring(1)));
        }
        return list;
    }

}
