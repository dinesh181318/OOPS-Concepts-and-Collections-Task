package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1.The get() method returns the element at the specified index, whereas the set() method changes the element.
//2.The java.util package provides a utility class Collections, which has the static method sort().
// Using the Collections.sort() method, we can easily sort the ArrayList.
public class ArrayListExample3 {
    public static void main(String[] args) {
        //1.
        ArrayList<String> al = new ArrayList<String>();
        al.add("dinesh");
        al.add("vijay");
        al.add("praveen");
        al.add("hari");
        System.out.println("Selected name: "+al.get(3));
        al.set(1,"Rajesh");
        for(String names:al){
            System.out.println(names);
        }
        //2.
        List<String> list = new ArrayList<String>();
        list.add("dinesh");
        list.add("vijay");
        list.add("praveen");
        list.add("hari");
        Collections.sort(list);
        System.out.println("Sorted list");
        for (String names:list) {
            System.out.println(names);
        }
        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(10);
        listInt.add(1);
        listInt.add(5);
        listInt.add(0);
        listInt.add(-1);
        listInt.add(-100);
        Collections.sort(listInt);
        System.out.println("Sorted Numbers");
        for (Integer numbers:listInt) {
            System.out.println(numbers);
        }
    }
}

