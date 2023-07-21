import java.util.*;
interface Book {
    void displayInfo();
}

abstract class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void displayInfo();
}

class BookItem extends LibraryItem implements Book {
    private String isbn;

    public BookItem(String title, String author, int year, String isbn) {
        super(title, author, year);
        this.isbn = isbn;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);
    }
}

class MagazineItem extends LibraryItem {
    private String publisher;

    public MagazineItem(String title, String author, int year, String publisher) {
        super(title, author, year);
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
    }
}

class Library {
    private LibraryItem[] items;
    private int numItems;

    public Library(int maxItems) {
        items = new LibraryItem[maxItems];
        numItems = 0;
    }

    public void addItem(LibraryItem item) {
        if (numItems < items.length) {
            items[numItems] = item;
            numItems++;
        } else {
            System.out.println("Cannot add item: library is full");
        }
    }

    public void displayAllItems() {
        for (int i = 0; i < numItems; i++) {
            items[i].displayInfo();
            System.out.println("-------------------");
        }
    }

}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(10);

        BookItem book1 = new BookItem("Java: A Beginner's Guide", "shane watson", 2019, "978-1260440217");
        MagazineItem magazine1 = new MagazineItem("Little Hearts", "Shakespeare", 2023, "NCTCR");

        library.addItem(book1);
        library.addItem(magazine1);

        library.displayAllItems();
    }
}