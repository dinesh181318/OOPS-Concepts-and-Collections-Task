package OopsConceptsAndCollectionsExamples.Abstraction;
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Another way, it shows only essential things to the user and hides the internal details

//Ways to achieve Abstraction:
//There are two ways to achieve abstraction in java
//1.Abstract class
//2.Interface

//Abstract class in Java:
//1.A class which is declared as abstract is known as an abstract class.
//2.It can have abstract and non-abstract methods. It needs to be extended and its method implemented.
//3.It cannot be instantiated.

//Points to Remember:
//1.An abstract class must be declared with an abstract keyword.
//2.It can have abstract and non-abstract methods.
//3.It cannot be instantiated.
//4.It can have constructors and static methods also.
//5.It can have final methods which will force the subclass not to change the body of the method.

//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}
public class Main {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
