package Homework_8_1;
import java.util.Arrays;

public class Book implements Printable {
    private String title;
    private String author;

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
        Arrays.stream(printable)
                .filter(item -> item instanceof Book)
                .map(item -> ((Book) item).getTitle())
                .forEach(System.out::println);
    }
}


