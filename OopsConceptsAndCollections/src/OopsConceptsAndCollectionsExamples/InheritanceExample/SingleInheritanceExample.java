package OopsConceptsAndCollectionsExamples.InheritanceExample;
//When a class inherits another class, it is known as a single inheritance.

class Company{ //parent class
    void companyName(String name){System.out.println(name+" is an one of the Employee in Grhombus Technology Pvt ltd");}
}
class Employee extends Company{ //child class
    void designation(String name){System.out.println(name+" is Working as a Software developer");}
}

public class SingleInheritanceExample {

    public static void main(String args[]) {
        String name = "Dinesh";
        Employee emp = new Employee();
        emp.designation(name);
        emp.companyName(name);
    }
}
