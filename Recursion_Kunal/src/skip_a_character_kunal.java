public class skip_a_character_kunal {
    public static void main(String[] args) {
        skip("","baccdah");
    }

    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); // take the first character of the string each time we call a new string
        if(ch=='a') { // checking if the first character is a or not if yes we skip it and move to the next leeter
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

}
