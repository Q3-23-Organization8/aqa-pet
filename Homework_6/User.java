package Homework_6;

public class User {
    private String userName;
    private int age;
    private String email;
    private String password;
    private boolean isActive;
    private double amountSpentMoney;

    // The default constructor
    public User() {
        this.userName = "Unknown";
        this.age = 0;
        this.email = "";
        this.password = "";
        this.isActive = false;
        this.amountSpentMoney = 0.0;
    }

    // Constructor that accepts userName
    public User(String userName) {
        this(); // We call the default constructor to initialize the rest of the fields
        this.userName = userName;
    }

    // Constructor that accepts userName and password
    public User(String userName, String password) {
        this(userName); // We call the constructor with one parameter
        setPassword(password);
    }

    // Getters and setters for userName, age, email, isActive fields

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Incorrect age.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Getter and setter for the password field with validation

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // Password validation
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must contain at least 6 characters.");
        }
    }

    // Method for making purchase
    public void makePurchase(double purchasePrice) {
        System.out.println(userName + " made a purchase for the amount " + purchasePrice + " грн.");
        amountSpentMoney += purchasePrice;
    }

    // A method for outputting the total cost
    public void printTotalAmountOfSpentMoney() {
        System.out.println(userName + " spent in total " + amountSpentMoney + " грн.");
    }
}

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

