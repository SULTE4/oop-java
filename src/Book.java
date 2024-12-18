package src;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String isbn;
    private boolean available;

    public Book(String title, String author, int pages, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
