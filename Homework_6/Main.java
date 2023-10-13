package Homework_6;

public class Main {
    public static void main(String[] args) {
        int result1 = Calculator.add(7, 3);
        System.out.println("7 + 3 = " + result1);

        int result2 = Calculator.subtract(12, 8);
        System.out.println("12 - 8 = " + result2);

        int result3 = Calculator.multiply(5, 7);
        System.out.println("5 * 7 = " + result3);

        try {
            double result4 = Calculator.divide(10.0, 2.0);
            System.out.println("10.0 / 2.0 = " + result4);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}