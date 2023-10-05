package Homework_5;

public class main_1 {
    public static void main(String[] args) {
        int n = 37; // Number of values sin(x)
        double[] sinValues = new double[n];

        for (int i = 0; i < n; i++) {
            int x = i * 10;
            double sinX = Math.sin(Math.toRadians(x));
            sinValues[i] = sinX;
        }

        // Let's display the table of values sin(x)
        System.out.println("x\t\tsin(x)");
        System.out.println("---------------------");

        for (int i = 0; i < n; i++) {
            int x = i * 10;
            double sinX = sinValues[i];
            System.out.println(x + "\t\t" + sinX);
        }
    }
}