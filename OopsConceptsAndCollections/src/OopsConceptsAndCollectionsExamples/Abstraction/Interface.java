package OopsConceptsAndCollectionsExamples.Abstraction;
//Interface:
//1.An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//2.The interface in Java is a mechanism to achieve abstraction.
//3.There can be only abstract methods in the Java interface, not method body.
//4.It is used to achieve abstraction and multiple inheritance in Java.
//5.In other words, you can say that interfaces can have abstract methods and variables.
//6.It cannot have a method body.
//7.Java Interface also represents the IS-A relationship.
//8.It cannot be instantiated just like the abstract class.
//9.Since Java 8, we can have default and static methods in an interface.
//10.Since Java 9, we can have private methods in an interface.

//Why use Java interface?
//There are mainly three reasons to use interface. They are given below.
//1.It is used to achieve abstraction.
//2.By interface, we can support the functionality of multiple inheritance.
//3.It can be used to achieve loose coupling.
interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){System.out.println("I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

public class Interface{
    public static void main(String args[]){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

