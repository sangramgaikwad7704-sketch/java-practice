import java.util.Scanner;

public class Book {

    String title;
    String author;
    double price;

    // Constructor 1
    Book(String title) {
        this(title, "Unknown", 0);
    }

    // Constructor 2
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Book 1
        System.out.print("Enter Book 1 title: ");
        String title1 = sc.nextLine();

        Book b1 = new Book(title1);

        // Book 2
        System.out.print("Enter Book 2 title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter Book 2 author: ");
        String author2 = sc.nextLine();

        System.out.print("Enter Book 2 price: ");
        double price2 = sc.nextDouble();

        Book b2 = new Book(title2, author2, price2);

        // Output
        System.out.println("\nBook 1:");
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Price: " + b1.price);

        System.out.println("\nBook 2:");
        System.out.println("Title: " + b2.title);
        System.out.println("Author: " + b2.author);
        System.out.println("Price: " + b2.price);

        sc.close();
    }
}