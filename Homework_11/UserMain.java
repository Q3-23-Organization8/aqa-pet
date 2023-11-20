package Homework_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Jack", "Smith", 21),
                new User("Anna", "Clark", 35),
                new User("Jim", "White", 25),
                new User("Sarah", "Lewis", 29),
                new User("Dany", "Hall", 32),
                new User("Olesia", "Taylor", 18),
                new User("Bob", "Harris", 43),
                new User("Janny", "Lee", 24),
                new User("Andrii", "Allen", 28),
                new User("John", "Young", 17)
        );

        // Display the original list
        System.out.println("Original List:");
        users.forEach(System.out::println);

        // Step b: Sort by age and collect into a new list
        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

        // Display the sorted list by age
        System.out.println("\nSorted List by Age:");
        sortedByAge.forEach(System.out::println);

        // Step c: Calculate average age
        double averageAge = users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);

        // Display the average age
        System.out.println("\nAverage Age: " + averageAge);

        // Step d: Sort by firstName and then by age
        List<User> sortedByFirstNameAndAge = users.stream()
                .sorted((u1, u2) ->
                        u1.getFirstName().compareToIgnoreCase(u2.getFirstName()) != 0 ?
                                u1.getFirstName().compareToIgnoreCase(u2.getFirstName()) :
                                Integer.compare(u1.getAge(), u2.getAge()))
                .toList();

        // Display the sorted list by firstName and age
        System.out.println("\nSorted List by FirstName and Age:");
        sortedByFirstNameAndAge.forEach(System.out::println);

        // Step e: Check if there are users with names starting with "S" or "A"
        boolean hasSOrA = users.stream()
                .anyMatch(u -> u.getSecondName().startsWith("S") || u.getSecondName().startsWith("A"));

        // Display the result of users with names starting with "S" or "A"
        System.out.println("\nUsers with S or A in SecondName: " + hasSOrA);

        // Step f: Check if all users are older than 18
        boolean allOlderThan18 = users.stream()
                .allMatch(u -> u.getAge() > 18);

        // Display the result of all users being older than 18
        System.out.println("\nAll Users Older Than 18: " + allOlderThan18);
    }
}