import java.util.LinkedList;

public class task2_1 { 
    // LinkedList result = reverse();
}

public LinkedList reverse(LinkedList linkedList) {
    int[] array = new int[linkedList.size()];
    Node current = linkedList.head();
    int index = 0;
    while (current != null) {
        array[index] = current.data;
        current = current.next;
        index++;
    }
    LinkedList reversed = new LinkedList();
    for (int i = size - 1; i >= 0; i--) {
        reversed.add(array[i]);
    }
    return reversed;
}