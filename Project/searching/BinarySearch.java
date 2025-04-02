package searching;

import doublylinkedlist.DoublyLinkedList;

public class BinarySearch {
    public static DoublyLinkedList.Node search(DoublyLinkedList list, int target) {
        DoublyLinkedList.Node start = list.head;
        DoublyLinkedList.Node end = getLastNode(list);

        while (start != null && end != null && start != end.next) {
            DoublyLinkedList.Node mid = getMiddle(start, end);
            if (mid == null) return null;
            if (mid.data == target) return mid;
            else if (mid.data < target) start = mid.next;
            else end = mid.prev;
        }
        return null; // Not found
    }

    private static DoublyLinkedList.Node getLastNode(DoublyLinkedList list) {
        DoublyLinkedList.Node temp = list.head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    private static DoublyLinkedList.Node getMiddle(DoublyLinkedList.Node start, DoublyLinkedList.Node end) {
        if (start == null || end == null) return null;
        DoublyLinkedList.Node slow = start, fast = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
