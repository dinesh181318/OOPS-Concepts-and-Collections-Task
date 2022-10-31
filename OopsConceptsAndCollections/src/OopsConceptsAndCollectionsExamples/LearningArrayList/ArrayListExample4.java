package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//There are various ways to traverse the collection elements:
//By Iterator interface.
//By for-each loop.
//By ListIterator interface.
//By for loop.
//By forEach() method.
//By forEachRemaining() method.
public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("dinesh");
        al.add("vijay");
        al.add("praveen");
        al.add("hari");
        //By Iterator interface.
        System.out.println("Traverse via Iterator interface");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //By for-each loop.
        System.out.println("Traverse via for-each loop");
        for (String names:al) {
            System.out.println(names);
        }
        //By ListIterator interface
        System.out.println("Traverse via ListIterator interface");
        ListIterator<String> list = al.listIterator(al.size());
        while (list.hasPrevious()){
            String str = list.previous();
            System.out.println(str);
        }
        //By for loop
        System.out.println("Traverse via for loop");
        for (int i=0 ; i<al.size();i++){
            System.out.println(al.get(i));
        }
        //By forEach() method.
        System.out.println("Traverse via forEach() method");
        al.forEach(name->{
            System.out.println(name);

        });
        //By forEachRemaining() method.
        System.out.println("Traverse via forEachRemaining() method");
        Iterator<String > itr1 = al.iterator();
        itr1.forEachRemaining(name->{
            System.out.println(name);

        });


    }
}
