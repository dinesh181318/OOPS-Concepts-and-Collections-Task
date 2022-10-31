package OopsConceptsAndCollectionsExamples.LinkedList;
//LinkedList:
//1.Java LinkedList class uses a doubly linked list to store the elements.
//2.It provides a linked-list data structure.
//3.It inherits the AbstractList class and implements List and Deque interfaces.

//The important points about Java LinkedList are:
//1.Java LinkedList class can contain duplicate elements.
//2.Java LinkedList class maintains insertion order.
//3.Java LinkedList class is non synchronized.
//4.In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//5.Java LinkedList class can be used as a list, stack or queue.

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListExample1 {
    public static void main(String args[]) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Dinesh");
        al.add("Vijay");
        al.add("Praveen");
        al.add("Kumar");

        System.out.println("foreachmethod");
        for (String name : al) {
            System.out.println(name);
        }
        //Traversing the list of elements in reverse order
        System.out.println("Reverse order:");

        Iterator<String> itr = al.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
