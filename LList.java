public class LList {
    private Node head;
    private int size;

    public LList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Node head() {
        return head;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeHead() {
        head = head.next;
        size--;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}