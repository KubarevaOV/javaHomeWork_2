public class Queue {
    private LList list = new LList();

    public void enqueue(int item) {
        list.add(item);
    }

    public Node dequeue() {
        Node first = first();
        list.removeHead();
        return first;
    }

    public Node first() {
        return list.head();
    }
}
