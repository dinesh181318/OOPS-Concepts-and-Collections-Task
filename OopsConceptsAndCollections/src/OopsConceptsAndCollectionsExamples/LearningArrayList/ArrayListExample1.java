package OopsConceptsAndCollectionsExamples.LearningArrayList;
//Java ArrayList class can contain duplicate elements.
//Java ArrayList class maintains insertion order.
//Java ArrayList class is non synchronized.
//Java ArrayList allows random access because the array works on an index basis.
//In ArrayList, manipulation is a little bit slower than the LinkedList in Java because
// a lot of shifting needs to occur if any element is removed from the array list.
//We can not create an array list of the primitive types, such as int, float, char, etc.
// It is required to use the required wrapper class in such cases.
// Java ArrayList gets initialized by the size. The size is dynamic in the array list,
// which varies according to the elements getting added or removed from the list.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("dinesh");
        list.add("kumar");
//        Iterator<String> itr = list.iterator();
        System.out.println(list);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
