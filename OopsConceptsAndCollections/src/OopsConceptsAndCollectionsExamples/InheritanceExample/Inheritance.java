package OopsConceptsAndCollectionsExamples.InheritanceExample;

//INHERITACE:
//1.Inheritance in Java is a mechanism in which one object acquires all
// the properties and behaviors of a parent object.
//2. It is an important part of OOPs (Object Oriented programming system).
//3.The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.
//4.Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
//why?
// 1.For Method Overriding (so runtime polymorphism can be achieved).
//2.For Code Reusability.

public class Inheritance { //parent class
    private String BankName;
    private double rateOfInterest;
    public final void getBankDetails(String bankName, double rateOfInterest){
        this.BankName = bankName;
        this.rateOfInterest = rateOfInterest;
        System.out.println("Rate of Interest in "+this.BankName+" is "+this.rateOfInterest+"%");
    }
}

 class Child extends Inheritance{ //child class
    public static void main(String[] args) {
        Child sbi = new Child();
        Child indian = new Child();
        Child axis = new Child();
        //Accessing parent class private member variable through a parent class public method
        indian.getBankDetails("Indian Bank",5.25);
        axis.getBankDetails("Axis Bank",6.15);
        sbi.getBankDetails("State Bank Of India",7.25);


    }
}


