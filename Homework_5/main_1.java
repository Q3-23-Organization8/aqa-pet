package Homework_5;

import java.util.Random;

public class main_1 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(8, 1, 60); // Generate an array of 8 random numbers in the range from 1 to 60

        System.out.println("Initial array:");
        printArray(array);

        replaceEvenNumbersWithZero(array);

        System.out.println("\nArray after replacing even numbers with 0:");
        printArray(array);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static void replaceEvenNumbersWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
