public class task2_1 { 
    public LList reverse(LList linkedList) {
        int[] array = new int[linkedList.size()];
        Node current = linkedList.head();
        int index = 0;
        while (current != null) {
            array[index] = current.data;
            current = current.next;
            index++;
        }
        LList reversed = new LList();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversed.add(array[i]);
        }
        return reversed;
    }
}