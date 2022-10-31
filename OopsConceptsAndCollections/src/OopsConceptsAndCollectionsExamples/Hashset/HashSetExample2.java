package OopsConceptsAndCollectionsExamples.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Dinesh");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set=new HashSet(list);
        set.add("Kumar");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
