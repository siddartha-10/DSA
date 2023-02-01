public class skip_app_not_apple_kunal {
    public static void main(String[] args) {
        System.out.println(skip_app_not_apple("bacdappfapplegh"));
    }

    public static String skip_app_not_apple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip_app_not_apple(up.substring(3));
        }
        else{
            return up.charAt(0) + skip_app_not_apple(up.substring(1));
        }
    }

}
