package OopsConceptsAndCollectionsExamples.JavaList;

import java.util.ArrayList;
import java.util.List;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ListExample4 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new ArrayList<>();
        //Creating Books
        Book b1=new Book(101,"C++","Max","BPB",8);
        Book b2=new Book(102,"Python","james","Hill",4);
        Book b3=new Book(103,"Java","James Gosling","Sun",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book b:list){
            System.out.println("ID:"+b.id+", Name: "+b.name+", Author: "+b.author+", Publisher: "+b.publisher+", Quantity: "+b.quantity);
        }
    }
}
