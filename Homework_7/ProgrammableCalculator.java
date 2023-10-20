package Homework_7;

public class ProgrammableCalculator extends Calculator {
    private String memory;

    public void storeValue(String value) {
        memory = value;
    }

    public String recallValue() {
        return memory;
    }
}