package code;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // next insertion position
    protected int end = 0;

    // position of the first element
    protected int front = 0;

    // Keeps track of the number of elements currently in the queue
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        // Creates an array of the given size
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;

        // If end reaches the array length, % brings it back to index 0
        end = end % data.length;
        size++;
        return true;
    }

    // Removes and returns the first element of the queue
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];

        // If front reaches the end of the array, bring it back to index 0
        front = front % data.length;
        size--;
        return removed;
    }

    // Returns the first element without removing it
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;

            // If i reaches the end of the array, bring it back to index 0
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
