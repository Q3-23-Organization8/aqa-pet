package Homework_10_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        List<String> words = List.of("ship", "plane", "tram", "ship", "bike", "dress", "tram");

        // HashMap for counting the frequency of occurrence of words
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            // We check whether the word already exists in the HashMap
            if (wordFrequency.containsKey(word)) {
                // If the word already exists, we increase the counter by 1
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                // If the word does not exist yet, we add it to the HashMap with a counter of 1
                wordFrequency.put(word, 1);
            }
        }

        // We derive unique words and their occurrence frequency
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}