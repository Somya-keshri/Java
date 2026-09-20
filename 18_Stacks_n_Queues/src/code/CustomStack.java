package code;

public class CustomStack {
    // Array used to store the stack elements
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // -1 means the stack is currently empty
    int ptr = -1;   // points to top element

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    // Constructor that allows us to specify the stack size
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // Adds an element to the top of the stack
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    // Removes and returns the top element of the stack
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;

        // Return the current top element
        // Then decrease ptr by 1
        return data[ptr--];
    }

    // Returns the top element without removing it
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;   // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;   // no element in the stack
    }
}
