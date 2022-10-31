package OopsConceptsAndCollectionsExamples.Polymorphism;
//Compile-Time-Polymorphism:
//1.Compile-time polymorphism is also known as static polymorphism or early binding.
//2.Compile-time polymorphism is a polymorphism that is resolved during the compilation process.
//3.Overloading of methods is called through the reference variable of a class.

//Advantage of method overloading?
//Method overloading increases the readability of the program.
//
// Different ways to overload the method:
//There are two ways to overload the method in java
//        1.By changing number of arguments
//        2.By changing the data type
class CalculationByChangingNumOfArgs{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
class CalculationByChangingDataType {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CalculationByChangingNumOfArgs obj1=new CalculationByChangingNumOfArgs();
        //CTP achieved by changing Number of arguments
        System.out.println("CTP achieved by changing Number of arguments");
        obj1.sum(10,10,10);
        obj1.sum(20,20);
        //CTP achieved by changing DataType
        CalculationByChangingDataType obj2 = new CalculationByChangingDataType();
        System.out.println("CTP achieved by changing DataType");
        obj2.sum(11.5,11.5);
        obj2.sum(30,20);

    }
}
