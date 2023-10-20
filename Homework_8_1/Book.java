package Homework_8_1;
public class Book implements Printable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public void print() {
        System.out.println("Printing a book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println(((Book) item).getTitle());
            }
        }
    }
}


