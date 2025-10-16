package code;

public class DLL {
    private Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(8, 65);

        list.display();
        list.find(15);


        list.deleteFirst();
        list.display();

        list.insert(2, 54);
        list.display();
        list.deleteLast();
        list.display();

        list.delete(65);
        list.display();
        list.reverse();
    }

    public void display() {
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
    }

    public void reverse() {
        Node node = head;

        if (node == null) {
            System.out.println("List is empty");
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        System.out.println("Print in reverse");
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println("START");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
        System.out.println("First node deleted");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Last node deleted");
            return;
        }

        // Traverse to the second last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Remove link to last node
        last.prev.next = null;
        System.out.println("Last node deleted");
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head node itself is to be deleted
        if (head.val == value) {
            deleteFirst();
            return;
        }

        Node temp = head;
        while (temp != null && temp.val != value) {
            temp = temp.next;
        }

        // If value not found
        if (temp == null) {
            System.out.println("Value " + value + " not found in list");
            return;
        }

        // If last node is to be deleted
        if (temp.next == null) {
            deleteLast();
            return;
        }

        // Re-link neighbors
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        System.out.println("Node with value " + value + " deleted");
    }
}
