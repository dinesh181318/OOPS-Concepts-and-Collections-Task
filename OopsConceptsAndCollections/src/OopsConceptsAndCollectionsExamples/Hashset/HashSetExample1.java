package OopsConceptsAndCollectionsExamples.Hashset;
//Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.

//The important points about Java HashSet class are:
//1.HashSet stores the elements by using a mechanism called hashing.
//2.HashSet contains unique elements only.
//3.HashSet allows null value.
//4.HashSet class is non synchronized.
//4.HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//5.HashSet is the best approach for search operations.
//6.The initial default capacity of HashSet is 16, and the load factor is 0.75.

//Hierarchy of HashSet class
//The HashSet class extends AbstractSet class which implements Set interface.
// The Set interface inherits Collection and Iterable interfaces in hierarchical order.

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        set.add("Ravi");
        for (String names:set) {
            System.out.println(names);

        }
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }

}
