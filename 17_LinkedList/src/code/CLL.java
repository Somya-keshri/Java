package code;

public class CLL {
    private Node head;
    private Node tail;

    // Constructor to initialize an empty circular linked list
    public CLL() {
        this.head = null;
        this.tail = null;
    }

    // Inner Node class representing each element of the CLL
    private class Node {
        int val;     // value stored in the node
        Node next;    // reference to the next node

        public Node(int val) {
            this.val = val;    // Assign the given value to this node's 'val' variable
        }
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(15);
        list.insert(32);
        list.insert(57);
        list.insert(81);
        list.insert(39);
        list.display();

        list.delete(32);
        list.display();

        list.insert(25);
        list.delete(81);
        list.display();

        list.insert(63);
        list.display();
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {    // Case: list is empty
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);     // Stop when we reach back to head
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
}
