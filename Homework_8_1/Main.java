package Homework_8_1;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];

        printableItems[0] = new Book("Harry Potter", "Joanne Rowling");
        printableItems[1] = new Magazine("Disputatio", "De Gruyter Poland");
        printableItems[2] = new Book("Dead man’s money", "John Escott");
        printableItems[3] = new Magazine("«Amazonia Investiga»", "EDITORIAL PRIMMATE S.A.S");

        // Using lambda expression to print each item in the array
        for (Printable printable : printableItems) {
            printable.print();
            System.out.println();
        }

        // Using lambda expression to print only magazines
        printFiltered(printableItems, item -> item instanceof Magazine);

        // Using lambda expression to print only books
        printFiltered(printableItems, item -> item instanceof Book);
    }

    // Generic method to print items based on a filter
    private static void printFiltered(Printable[] printableItems, PrintFilter filter) {
        for (Printable item : printableItems) {
            if (filter.test(item)) {
                item.print();
                System.out.println();
            }
        }
    }
}

interface PrintFilter {
    boolean test(Printable printable);
}