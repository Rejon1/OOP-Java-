// Book class representing a book in the library
class Book {
    String bookName;
    String authorName;
    int quantity;

    // Constructor
    public Book(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    // Method to issue a book
    public void issueBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Book issued: " + bookName);
        } else {
            System.out.println("Book not available: " + bookName);
        }
    }

    // Method to return a book
    public void returnBook() {
        quantity++;
        System.out.println("Book returned: " + bookName);
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + bookName + ", Author: " + authorName + ", Quantity: " + quantity);
    }
}


// Main class to test the Library system
public class Lab24 {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 3);
        Book book2 = new Book("1984", "George Orwell", 2);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1);

        // Display initial state
        System.out.println("\n--- Book Inventory ---");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        // Issue and return operations
        System.out.println("\n--- Issuing Books ---");
        book1.issueBook(); // Should succeed
        book3.issueBook(); // Should succeed
        book3.issueBook(); // Should fail (no more copies)

        System.out.println("\n--- Returning Books ---");
        book3.returnBook(); // Return one copy

        // Display final state
        System.out.println("\n--- Updated Book Inventory ---");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}
