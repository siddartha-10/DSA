import java.util.ArrayList;

public class String_Subseq_kunal {
    public static void main(String[] args) {
        //subseq("","abc");
        System.out.println(subseqarr("","abc"));
    }

    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subseqarr(String p, String up){ // returning array list without passsing in parameters.
        if(up.isEmpty()){
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }
        char ch = up.charAt(0);
        ArrayList<String> right =  subseqarr(p+ch,up.substring(1));
        ArrayList<String> left =  subseqarr(p,up.substring(1));

        right.addAll(left);
        return right;
    }

}
