package Homework_14;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserMainTest {

    private static List<User> users;

    @BeforeAll
    static void setUp() {
        users = List.of(
                new User("Jack", "Smith", 21),
                new User("Anna", "Clark", 35),
                new User("Jim", "White", 25),
                new User("Sarah", "Lewis", 29),
                new User("Dany", "Hall", 32),
                new User("Olesia", "Taylor", 23),
                new User("Bob", "Harris", 43),
                new User("Janny", "Lee", 24),
                new User("Andrii", "Allen", 28),
                new User("John", "Young", 19)
        );
    }

    @Test
    void testSortedByAge() {
        List<User> sortedByAge = UserMain.sortByAge(users);
        // Positive test
        assertNotNull(sortedByAge);
        assertEquals(users.size(), sortedByAge.size());
        assertTrue(sortedByAge.stream().allMatch(u -> u.getAge() >= 0));

        // Negative test
        List<User> emptyList = UserMain.sortByAge(List.of());
        assertNotNull(emptyList);
        assertTrue(emptyList.isEmpty());
    }

    @Test
    void testCalculateAverageAge() {
        double averageAge = UserMain.calculateAverageAge(users);
        // Positive test
        assertEquals(27.2, averageAge, 0.1);

        // Negative test
        double averageAgeEmpty = UserMain.calculateAverageAge(List.of());
        assertEquals(0, averageAgeEmpty);
    }

    @RepeatedTest(10)
    void testSortedByFirstNameAndAge() {
        List<User> sortedByFirstNameAndAge = UserMain.sortByFirstNameAndAge(users);
        // Positive test
        assertNotNull(sortedByFirstNameAndAge);
        assertEquals(users.size(), sortedByFirstNameAndAge.size());
        assertTrue(sortedByFirstNameAndAge.stream().allMatch(u -> u.getAge() >= 0));

        // Negative test
        List<User> emptyList = UserMain.sortByFirstNameAndAge(List.of());
        assertNotNull(emptyList);
        assertTrue(emptyList.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(strings = {"S", "A"})
    void testUsersWithSOrAInSecondName(String letter) {
        boolean hasSOrA = UserMain.hasUsersWithSOrA(users, letter);
        // Positive test
        assertTrue(hasSOrA);

        // Negative test
        boolean hasSOrAEmpty = UserMain.hasUsersWithSOrA(List.of(), letter);
        assertFalse(hasSOrAEmpty);
    }

    @Test
    void testAllOlderThan18() {
            boolean allOlderThan18 = UserMain.areAllUsersOlderThan18(users);
            // Positive test
            assertTrue(allOlderThan18);

            // Negative test
            boolean allOlderThan18Empty = UserMain.areAllUsersOlderThan18(List.of());
            assertTrue(allOlderThan18Empty);
    }

    @AfterEach
    void tearDown() {
        // Clean up after each test if necessary
    }

    @AfterAll
    static void tearDownAll() {
        // Clean up after all tests if necessary
    }
}