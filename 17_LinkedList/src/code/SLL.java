package code;

public class SLL {
    private class Node{
        private int value;
        private Node next;

        // Constructor to create a node with only a value (next is null by default)
        public Node(int value){
            this.value = value;
        }

        // Constructor to create a node with a value and reference to the next node
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;     // first node
    private Node tail;     // last node
    private int size;     // number of nodes

    // Constructor to initialize an empty singly linked list
    public SLL(){
        this.size = 0;    // initially, the list is empty
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(41);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(32);
        list.display();

        list.insertLast(55);
        list.insert(23, 2);
        list.display();

        list.deleteFirst();
        list.deleteLast();
        list.display();

        list.insert(7, 2);
        list.display();

        list.insertFirst(67);
        list.delete(3);
        list.display();
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }
}
