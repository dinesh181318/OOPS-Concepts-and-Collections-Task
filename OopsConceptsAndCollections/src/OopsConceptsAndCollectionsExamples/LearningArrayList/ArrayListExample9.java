package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;

public class ArrayListExample9 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        System.out.println("1st ArrayList is Empty: "+al1.isEmpty());

        al1.add("Dinesh");
        al1.add("Kumar");
        al1.add("Praveen");
        al1.add("Hari");
        al1.add("Vijay");
        System.out.println("1st ArrayList: "+al1);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Kumar");
        al2.add("Dinesh");
        al2.add("kavi");
        al2.add("Kane");
        System.out.println("2nd ArrayList"+al2);
        al1.retainAll(al2);
        System.out.println("1st ArrayList after retain: "+al1);
        System.out.println("1st ArrayList is Empty: "+al1.isEmpty());
    }
}
