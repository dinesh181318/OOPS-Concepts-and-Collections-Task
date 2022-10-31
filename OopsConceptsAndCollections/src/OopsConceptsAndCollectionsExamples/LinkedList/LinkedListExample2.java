package OopsConceptsAndCollectionsExamples.LinkedList;
//different ways to add elements.

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial list of elements: "+ll);
        ll.add("Dinesh");
        ll.add("Vijay");
        ll.add("Praveen");
        System.out.println("After invoking add method: "+ll);
        //Adding an element at the specific position
        ll.add(1, "Hari");
        System.out.println("After invoking add method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sai");
        ll2.add("Harish");
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll method: "+ll);
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("RJ");
        ll3.add("Anish");
        //Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll method: "+ll);
        //Adding an element at the first position
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst method: "+ll);
        //Adding an element at the last position
        ll.addLast("Vasanth");
        System.out.println("After invoking addLast method: "+ll);

    }
}
