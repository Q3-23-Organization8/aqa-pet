package Homework_10_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        Random random = new Random();
        int range = 41; // Your range -20 до 20

        // Fill the collection with random numbers
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(range) - 20;
            originalList.add(randomNumber);
        }

        // We delete duplicates using Set
        Set<Integer> uniqueSet = new HashSet<>(originalList);

        // Number of duplicates removed
        int duplicatesRemoved = originalList.size() - uniqueSet.size();

        // We output both collections and the number of deleted duplicates
        System.out.println("Starter collection:");
        System.out.println(originalList);

        System.out.println("Collection without duplicates:");
        System.out.println(uniqueSet);

        System.out.println("Number of duplicates removed: " + duplicatesRemoved);
    }
}