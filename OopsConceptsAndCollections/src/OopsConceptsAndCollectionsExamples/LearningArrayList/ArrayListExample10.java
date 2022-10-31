package OopsConceptsAndCollectionsExamples.LearningArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book() {
        this.id = setId();
        this.name = setName();
        this.author = setAuthor();
        this.publisher = setPublisher();
        this.quantity = setQuantity();
    }
    String setName(){
        System.out.println("enter Name");

        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }
    String setAuthor(){
        System.out.println("enter Author");

        Scanner author = new Scanner(System.in);
        return author.nextLine();
    }
    String setPublisher(){
        System.out.println("enter Publisher");

        Scanner publisher = new Scanner(System.in);
        return publisher.nextLine();
    }
    int setId(){
        System.out.println("enter ID");

        Scanner id = new Scanner(System.in);
        return id.nextInt();
    }
    int setQuantity(){
        System.out.println("enter Quantity");

        Scanner quantity = new Scanner(System.in);
        return quantity.nextInt();
    }

}

public class ArrayListExample10 {
    public static void main(String[] args) {
        Book bk = new Book();
        ArrayList<Book> al = new ArrayList<Book>();
        al.add(bk);
        System.out.println(al);
        for (Book book:al) {
            System.out.println("ID: "+book.id+", NAME: "+book.name+", AUTHOR: "+book.author+", PUBLISHER: "+book.publisher+", QUANTITY: "+book.quantity);

        }


    }

}
