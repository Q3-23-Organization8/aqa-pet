package Homework_8_1;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];

        printableItems[0] = new Book("Harry Potter", "Joanne Rowling");
        printableItems[1] = new Magazine("Disputatio", "De Gruyter Poland");
        printableItems[2] = new Book("Dead man’s money", "John Escott");
        printableItems[3] = new Magazine("«Amazonia Investiga»", "EDITORIAL PRIMMATE S.A.S");

        // call the print() method for each object in the array
        printableItems[0].print();
        System.out.println();
        printableItems[1].print();
        System.out.println();
        printableItems[2].print();
        System.out.println();
        printableItems[3].print();
        System.out.println();

        Magazine.printMagazines(printableItems); //Outputting Magazines only

        Book.printBooks(printableItems); //Outputting Books only
    }
}