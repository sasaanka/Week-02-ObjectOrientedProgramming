import java.util.*;
abstract class LibraryItem {
    final private int itemId;
    final private String title;
    final private String author;
    private String borrower; 
    private boolean reserved;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.reserved = false;
    }
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBorrower() { return borrower; }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public abstract int getLoanDuration();
}
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

public class LibraryManag {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book(101, "The Alchemist", "Paulo Coelho");
        LibraryItem m1 = new Magazine(102, "National Geographic", "Editorial Team");
        LibraryItem d1 = new DVD(103, "Interstellar", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            System.out.println("----------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable reservable) {
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("User1");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }
        }
    }
}
