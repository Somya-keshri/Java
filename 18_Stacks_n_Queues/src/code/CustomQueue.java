package code;

public class CustomQueue {
    // Array used to store the queue elements
    private int[] data;

    // Default queue size if no size is given
    private static final int DEFAULT_SIZE = 10;

    // 'end' tells us where the next element will be inserted (next insertion position)
    // Initially 0 because the queue is empty
    int end = 0;

    // Constructor with default size
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    // Constructor where we can give our own queue size
    public CustomQueue(int size) {
        // Creates an array of the given size
        this.data = new int[size];
    }

    // Checks whether the queue is full
    public boolean isFull() {
        return end == data.length;
    }

    // Checks whether the queue is empty
    public boolean isEmpty() {
        return end == 0;
    }

    // Adds an element to the queue
    public boolean insert(int item) {

        // If queue is full, we cannot insert
        if (isFull()) {
            return false;
        }

        // Store item at index 'end'
        // Then increase end by 1
        data[end++] = item;

        return true;
    }

    // Removes and returns the first element
    public int remove() throws Exception {

        // Cannot remove if queue is empty
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        // The first element is always at index 0
        int removed = data[0];

        // Shift all remaining elements one position to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        // One element has been removed
        end--;

        // Return the removed element
        return removed;
    }

    // Returns the first element without removing it
    public int front() throws Exception {

        // Cannot check front if queue is empty
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        // First element is always at index 0
        return data[0];
    }
    
    // Displays all elements currently present in the queue
    public void display() {

        // Loop only through the elements currently in the queue
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }

        System.out.println("END");
    }
}
