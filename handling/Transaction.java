package handling;

import java.util.Date;

public class Transaction {
    private handling.LibraryUser user;
    private Book book;
    private Date borrowDate;
    private Date dueDate;

    public Transaction(LibraryUser user, Book book) {

        this.user = user;
        this.book = book;
        this.borrowDate = new Date();
        this.dueDate = new Date(borrowDate.getTime() + 14L * 24 * 60 * 60 * 1000); // 14 days due
    }

    public Book getBook() {
        return book;
    }

    public LibraryUser getUser() {
        return user;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void displayTransaction() {
        System.out.println("User: " + user.getName() + ", Book: " + book.getTitle() + ", Due Date: " + dueDate);
    }
}
