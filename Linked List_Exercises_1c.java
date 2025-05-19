//1.Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package assignment;

import java.util.*;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Create iterator starting from index 1 (2nd element)
        Iterator<String> iterator = list.listIterator(1);

        // Iterate and print elements from 2nd position onward
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//2.Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package assignment;

import java.util.*;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        // Create a descending iterator (reverse order)
        Iterator<String> iterator = list.descendingIterator();

        // Print each element in reverse
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//3.Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))

package assignment;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");

        // Add "Pink" at the end of the list
        list.offerLast("Pink");

        // Print the updated list
        System.out.println("Updated List: " + list);
    }
}

//4.Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )

package assignment;

import java.util.*;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        // Print each element with its index position
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}

//5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

package assignment;

import java.util.*;

public class SwapElementsInLinkedList {
    public static void main(String[] args) {
        // Create and initialize linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");    // Index 0
        list.add("Green");  // Index 1
        list.add("Blue");   // Index 2

        // Print the list before swapping
        System.out.println("Before Swap: " + list);

        // Swap first (index 0) and third (index 2) elements
        Collections.swap(list, 0, 2);

        // Print the list after swapping
        System.out.println("After Swap: " + list);
    }
}



