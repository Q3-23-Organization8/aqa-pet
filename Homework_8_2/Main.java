package Homework_8_2;

public class Main {
    public static void main(String[] args) {
        // Creation of an array of objects and figures
        Shape[] shapes = new Shape[3];

        // Initialization of objects in the array
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(3.0, 4.0);
        shapes[2] = new Triangle(6.0, 8.0, 10.0);

        /* Calling methods for objects in an array */
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("--------");
        }
    }
}