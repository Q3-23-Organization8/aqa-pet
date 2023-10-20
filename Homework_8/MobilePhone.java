package Homework_8;
public abstract class MobilePhone implements Mobile {
    private final String brand;
    private final String model;

    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}