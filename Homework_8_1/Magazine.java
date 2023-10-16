package Homework_8_1;
public class Magazine implements Printable {
    private final String title;
    private final String publisher;

    public Magazine(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public void print() {
        System.out.println("Printing a magazine:");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine) item).getTitle());
            }
        }
    }
}
