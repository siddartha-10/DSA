import java.util.Stack;

public class inBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop()); // this will print 18
        System.out.println(stack.pop()); // this will print 9
        System.out.println(stack.pop()); // this will print 2
        System.out.println(stack.pop()); // this will print 45
        System.out.println(stack.pop()); // this will print 34

    }
}