public class Stack {
    private static final int MAX_SIZE = 1000; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] array; // Array to store stack elements

    public Stack() {
        top = -1;
        array = new int[MAX_SIZE];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Push an element onto the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push element " + data);
            return;
        }
        array[++top] = data;
        System.out.println("Pushed " + data + " to the stack");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop from an empty stack.");
            return -1; // Return a sentinel value to indicate underflow
        }
        int poppedElement = array[top--];
        System.out.println("Popped " + poppedElement + " from the stack");
        return poppedElement;
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate underflow
        }
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element after pops: " + stack.peek());
    }
}
