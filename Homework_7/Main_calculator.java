package Homework_7;

class MainCalculator {
    public static void main(String[] args) {
        // Creating an array of calculator objects
        Calculator[] calculators = new Calculator[3];

        // Initialization of objects in the array
        calculators[0] = new Calculator();
        calculators[1] = new ScientificCalculator();
        calculators[2] = new ProgrammableCalculator();

        // Calling calculator methods
        for (Calculator calculator : calculators) {
            double result = calculator.add(5.0, 3.0);
            System.out.println("Addition result: " + result);

            result = calculator.subtract(10.0, 2.0);
            System.out.println("Subtraction result: " + result);

            result = calculator.multiply(4.0, 6.0);
            System.out.println("Multiplication result: " + result);

            result = calculator.divide(8.0, 4.0);
            System.out.println("Division result: " + result);

            if (calculator instanceof ScientificCalculator scientificCalculator) {
                double powerResult = scientificCalculator.power(2.0, 3.0);
                System.out.println("Power result: " + powerResult);

                double squareRootResult = scientificCalculator.squareRoot(16.0);
                System.out.println("Square root result: " + squareRootResult);
            } else if (calculator instanceof ProgrammableCalculator programmableCalculator) {
                programmableCalculator.storeValue("42");
                String recalledValue = programmableCalculator.recallValue();
                System.out.println("Recalled value: " + recalledValue);
            }

            System.out.println("--------");
        }
    }
}
