public class Main {
    public static void main(String[] args) {
        handling.Library library = new handling.Library();


        library.addBook(new handling.Book("1984", "George Orwell", "12345"));
        library.addBook(new handling.Book("The Great Gatsby", "F. Scott Fitzgerald", "67890"));


        library.addUser(new handling.LibraryUser("Alice", "U001"));
        library.addUser(new handling.LibraryUser("Bob", "U002"));


        System.out.println("\n--- Borrowing Book ---");
        library.borrowBook("12345", "U001");
        library.displayBooks();
        library.displayTransactions();


        System.out.println("\n--- Returning Book ---");
        library.returnBook("12345");
        library.displayBooks();
        library.displayTransactions();
    }
}
// Main Class
