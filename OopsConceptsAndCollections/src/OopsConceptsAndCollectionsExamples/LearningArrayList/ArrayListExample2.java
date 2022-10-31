package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;

//traverse the ArrayList elements using the for-each loop
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("dinesh");
        al.add("vijay");
        al.add("praveen");
        al.add("hari");
        for (String names:al){
            System.out.println(names);
        }
    }

}
