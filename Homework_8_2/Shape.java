package Homework_8_2;
import java.util.Objects;

public abstract class Shape {
    protected String color;

    public Shape() {
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint() {
        System.out.println("Painting a " + color + " shape.");
    }

    @Override
    public String toString() {
        return "Shape{color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape other = (Shape) obj;
        return Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}