package Homework_10_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 8, 2, 10, 5, 7, 6));
        int x = 5;

        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {
            if (numbers.get(i) > x && numbers.get(j) <= x) {
                // We rearrange the elements if the number from the left end is greater than X, and from the right - no more than X
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
            }

            if (numbers.get(i) <= x) {
                i++;
            }

            if (numbers.get(j) > x) {
                j--;
            }
        }

        System.out.println(numbers);
    }
}