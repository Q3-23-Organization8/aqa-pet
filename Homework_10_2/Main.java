package Homework_10_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>(List.of(3, 8, 2, 10, 5, 7, 6));
        int X = 5;

        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {
            if (numbers.get(i) > X && numbers.get(j) <= X) {
                // We rearrange the elements if the number from the left end is greater than X, and from the right - no more than X
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
            }

            if (numbers.get(i) <= X) {
                i++;
            }

            if (numbers.get(j) > X) {
                j--;
            }
        }

        System.out.println(numbers);
    }
}