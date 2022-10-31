package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    int age;
    Student(){
        this.roll_no=setRoll_no();
        this.name = setName();
        this.age = setAge();

    }

    String setName(){
        System.out.println("enter name");

        Scanner name = new Scanner(System.in);
          return name.next();
    }
    int setRoll_no(){
        System.out.println("enter num");

        Scanner rollNo = new Scanner(System.in);
       return rollNo.nextInt();
    }
    int setAge(){
        System.out.println("enter age");

        Scanner age = new Scanner(System.in);
        return age.nextInt();
    }
}
public class ArrayListExample5 {
    public static void main(String[] args) {

        System.out.println("Enter Student details");
        Student s1 = new Student();
        System.out.println("Enter Student details");
        Student s2 = new Student();



        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        for (Student lists:list) {
            System.out.println("Roll_No: "+lists.roll_no+" Name: "+lists.name+" Age: "+lists.age);

        }

    }
}
