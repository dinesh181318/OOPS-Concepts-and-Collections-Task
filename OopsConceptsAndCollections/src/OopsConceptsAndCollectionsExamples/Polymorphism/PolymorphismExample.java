package OopsConceptsAndCollectionsExamples.Polymorphism;
//Polymorphism:
//1.Polymorphism in Java is a concept by which we can perform a single action in different ways.
//2.Polymorphism is derived from 2 Greek words: poly and morphs.
//3.The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
//4.There are two types of polymorphism in Java:
//5.compile-time polymorphism and runtime polymorphism.
//6.We can perform polymorphism in java by method overloading and method overriding.
//7.If you overload a static method in Java,
//8.it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.

//Run-Time-Polymorphism
//1.Runtime polymorphism or Dynamic Method Dispatch is a process
// in which a call to an overridden method is resolved at runtime rather than compile-time.
//2.In this process, an overridden method is called through the reference variable of a superclass.
// The determination of the method to be called is based on the object being referred to by the reference variable.
class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 9.7f;}
}
public class PolymorphismExample {
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}
