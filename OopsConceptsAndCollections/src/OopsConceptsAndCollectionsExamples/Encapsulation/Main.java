package OopsConceptsAndCollectionsExamples.Encapsulation;
//Encapsulation:
//1.Encapsulation in Java is a process of wrapping code and data together into a single unit
//2.We can create a fully encapsulated class in Java by making all the data members of the class private.
//Now we can use setter and getter methods to set and get the data in it

//Advantage of Encapsulation in Java
//1.By providing only a setter or getter method, you can make the class read-only or write-only.
// In other words, you can skip the getter or setter methods.
//2.It provides you the control over the data.
// Suppose you want to set the value of id which should be greater than 100 only,
// you can write the logic inside the setter method.
// You can write the logic not to store the negative numbers in the setter methods.
//3.It is a way to achieve data hiding in Java because other class will not be able
// to access the data through the private data members.
//4.The encapsulate class is easy to test. So, it is better for unit testing.
//5.The standard IDE's are providing the facility to generate the getters and setters.
// So, it is easy and fast to create an encapsulated class in Java.

//A Account class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
class Account {
    //private data members
    private long acc_no;
    private String name,email;
    private float amount;
    //public getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
public class Main {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc=new Account();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("Dinesh Kumar");
        acc.setEmail("dineshkumar@gmail.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println("ACC NO: "+acc.getAcc_no()+", Name: "+acc.getName()+", mail:"+acc.getEmail()+", Amount :"+acc.getAmount());
    }
}
