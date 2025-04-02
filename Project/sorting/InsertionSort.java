package sorting;

import doublylinkedlist.DoublyLinkedList;

public class InsertionSort {
    public static void sort(DoublyLinkedList list) {
        if (list.head == null || list.head.next == null) return;

        DoublyLinkedList.Node current = list.head.next;
        while (current != null) {
            DoublyLinkedList.Node temp = current;
            while (temp.prev != null && temp.prev.data > temp.data) {
                // Swap values
                int val = temp.data;
                temp.data = temp.prev.data;
                temp.prev.data = val;
                temp = temp.prev;
            }
            current = current.next;
        }
    }
}
