package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial Arraylist: "+al);
        al.add("Dinesh");
        al.add("hari");
        al.add("praveen");
        al.add("Rj");
        System.out.println("Arraylist: "+al);
        al.remove("Dinesh");
        System.out.println("Arraylist remove by object: "+al);
        al.remove(1);
        System.out.println("Arraylist remove by index: "+al);
        ArrayList<String> al1 = new ArrayList<String>();
        System.out.println("Initial 2nd Arraylist: "+al1);
        al1.add("Prathip");
        al1.add("sai");
        al1.add("Kumar");
        al1.add("Dinesh");
        System.out.println(" 2nd Arraylist: "+al1);
        al.addAll(al1);
        System.out.println(" Combined Arraylist: "+al);
        al.removeAll(al1);
        System.out.println(" Combined Arraylist after removeall: "+al);
        al.removeIf(names-> names.contains("Rj"));
        System.out.println(" Combined Arraylist after RemoveIf: "+al);
        al.clear();
        System.out.println(" Combined Arraylist after clear method(): "+al);








    }
}
