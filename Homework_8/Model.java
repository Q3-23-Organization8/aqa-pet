package Homework_8;

public class Model extends MobilePhone {
    public Model(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from " + getBrand() + " " + getModel());
    }
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending a message to " + recipient + " from " + getBrand() + " " + getModel() + ": " + message);
    }
}