//https://leetcode.com/problems/goal-parser-interpretation/
public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        String a = "";
        int i = 0;
        while(i<command.length()){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                a+="o";
                i = i + 2;
            }
            else if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
                a+="al";
                i=i+4;
            }
            else{
                a+="G";
                i++;
            }
        }
        return a;
    }

}
