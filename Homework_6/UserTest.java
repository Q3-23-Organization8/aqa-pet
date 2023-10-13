package Homework_6;

class UserTest {
    public static void main(String[] args) {
        // Creating instances of the User class and calling methods

        User user1 = new User("Mary", "password123");
        User user2 = new User("Kris");
        User user3 = new User("Ann");

        user1.setAge(45);
        user2.setAge(34);
        user3.setAge(29);

        user1.setEmail("mary@gmail.com");
        user2.setEmail("kris@gmail.com");
        user3.setEmail("ann@gmail.com");

        user1.setActive(true);
        user2.setActive(false);
        user3.setActive(true);

        user1.makePurchase(145.0);
        user2.makePurchase(45.0);
        user3.makePurchase(94.0);

        user1.printTotalAmountOfSpentMoney();
        user2.printTotalAmountOfSpentMoney();
        user3.printTotalAmountOfSpentMoney();
    }
}