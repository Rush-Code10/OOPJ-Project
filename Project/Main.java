import doublylinkedlist.DoublyLinkedList;
import sorting.InsertionSort;
import searching.BinarySearch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println("Original List:");
        list.display();

        // Sorting the list
        InsertionSort.sort(list);
        System.out.println("Sorted List:");
        list.display();

        // Searching for an element
        System.out.println("Enter element to search:");
        int target = sc.nextInt();
        DoublyLinkedList.Node result = BinarySearch.search(list, target);

        if (result != null) 
            System.out.println("Element " + target + " found in the list.");
        else 
            System.out.println("Element " + target + " not found.");

        sc.close();
    }
}
