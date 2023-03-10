import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inBuiltExamples {
    public static void main(String[] args) {
        /*
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
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        /*
        System.out.println(queue.peek());
        this is just used to see the first element of the queue
        it will not remove the element.
         */

        System.out.println(queue.remove()); // this will completely remove the element from the queue.
    }
}