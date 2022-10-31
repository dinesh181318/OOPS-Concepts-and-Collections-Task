package OopsConceptsAndCollectionsExamples.JavaList;
//List in Java provides the facility to maintain the ordered collection.
// It contains the index-based methods to insert, update, delete and search the elements.
// It can have the duplicate elements also. We can also store the null elements in the list.
//The List interface is found in the java.util package and inherits the Collection interface.
// It is a factory of ListIterator interface. Through the ListIterator,
// we can iterate the list in forward and backward directions.
//The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector.
// The ArrayList and LinkedList are widely used in Java programming.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample1{
    public static void main(String args[]){
        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);
//Array to ArrayList
        System.out.println("Converting Array to List");
       //Creating Array
       String[] array1={"Java","Python","PHP","C++"};
      System.out.println("Printing Array: "+Arrays.toString(array1));
      //Converting Array to List
      List<String> list1=new ArrayList<String>();
      for(String lang:array1){
        list1.add(lang);
       }
      System.out.println("Printing List: "+list1);
 //List to array
        System.out.println("Converting List to Array");
        String[] array2 = list.toArray(new String[list.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array2));
        System.out.println("Printing List: "+list);

        //accessing the element
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        list.set(1,"Dates");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

    }
}
