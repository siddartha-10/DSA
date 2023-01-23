public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb.toString());

        /* after all the operations we can convert the stringbuilder to a string by using StringBuilder.toString(). */
    }
}
