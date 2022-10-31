package OopsConceptsAndCollectionsExamples.InheritanceExample;
//When there is a chain of inheritance, it is known as multilevel inheritance.
// As you can see in the example given below,
// Student class inherits the Teacher class which again inherits the School class,
// so there is a multilevel inheritance.
class School {
    private String schoolName = "ABC School";
    void schoolDetails(String studentName) {
        System.out.println(studentName+" studies at "+schoolName);

    }
}
class Teacher extends School {
    private String teacherName = "Max";
    void teacherDeatils(String studentName) {
        System.out.println(studentName+" favorite teacher is "+teacherName);
    }

}
class Student extends Teacher {
    public String studentName = "Dinesh";
    void studentDetails(String studentName) {
        System.out.println("Student name is "+studentName);

    }


}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        String name = s1.studentName;
        s1.studentDetails(name);
        s1.teacherDeatils(name);
        s1.schoolDetails(name);
    }
}
