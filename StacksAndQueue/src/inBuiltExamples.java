import java.util.*;

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

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        this is just used to see the first element of the queue
        it will not remove the element.

        System.out.println(queue.remove()); // this will completely remove the element from the queue.
        
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(12);
        deque.add(15);
        deque.add(2);
        deque.add(3);
        deque.add(9);

        deque.addFirst(25); // this should add the element at the first position.
        deque.addLast(99); // this should add the element at the last position.

        System.out.println(deque.remove()); // this is used to remove the first element of the deque.

        deque.removeFirst(); // this is used to remove the first element works same as the remove but will not give an error

        deque.removeLast(); // this is used to remove the element from the last of the deque.
    }
}