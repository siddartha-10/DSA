public class skip_a_string_kunal {
    public static void main(String[] args) {
        System.out.println(skip_str("bdapplefg"));
    }

    public static String skip_str(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip_str(up.substring(5));
        }
        else{
            return up.charAt(0) + skip_str(up.substring(1));
        }
    }

}
