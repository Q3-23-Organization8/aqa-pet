package Homework_8;

public class Main {
    public static void main(String[] args) {
        Model mobilePhone = new Model("iPhone", "15 Pro Max");
        mobilePhone.displayDetails();
        mobilePhone.makeCall("345-321-3498");
        mobilePhone.sendMessage("Anna", "Hello, Anna!");
    }
}