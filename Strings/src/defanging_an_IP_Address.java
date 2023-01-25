// https://leetcode.com/problems/defanging-an-ip-address/
public class defanging_an_IP_Address {
    public static void main(String[] args) {
        String sb = "1.1.1.1";
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb);
        char ch1 ='[';
        char ch2 = ']';
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='.'){
                sb1.append('[');
                sb1.append(sb.charAt(i));
                sb1.append(']');
            }
            else {
                sb1.append(sb.charAt(i));
            }
        }
        System.out.println(sb1);
    }
}
