package OopsConceptsAndCollectionsExamples.LinkedHashSet;
//1.Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
// It inherits the HashSet class and implements the Set interface.

import java.util.LinkedHashSet;

//The important points about the Java LinkedHashSet class are:
//1.Java LinkedHashSet class contains unique elements only like HashSet.
//2.Java LinkedHashSet class provides all optional set operations and permits null elements.
//3.Java LinkedHashSet class is non-synchronized.
//4.Java LinkedHashSet class maintains insertion order.
public class Example1 {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five");//ignores duplicate elements
        for (String num:set) {
            System.out.println(num);
        }
    }
}
