import java.util.Stack;

public class p3_Stack {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for an element (1 based indexing)
        System.out.println("Position of 10: " + stack.search(10));
    }
}

/*
---Output---
Stack: [10, 20, 30]
Top element: 30
Popped element: 30
Stack after pop: [10, 20]
Is stack empty? false
Position of 10: 2

*/