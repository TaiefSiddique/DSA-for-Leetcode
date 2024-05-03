import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        // Create a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements from the stack
        System.out.println(stack.pop()); // Outputs: 30
        System.out.println(stack.pop()); // Outputs: 20

        // Peek at the top element of the stack without removing it
        System.out.println(stack.peek()); // Outputs: 10

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // Outputs: false

        // Pop the remaining element
        System.out.println(stack.pop()); // Outputs: 10

        // Check if the stack is empty after popping all elements
        System.out.println(stack.isEmpty()); // Outputs: true
    }
}
