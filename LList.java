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

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
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