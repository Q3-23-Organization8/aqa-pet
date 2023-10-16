package Homework_5;

public class main_1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -3, 8},
                {3, -2, 6},
                {5, 6, -9}
        };

        int negativeCount = countNegativeBelowDiagonal(matrix);
        int oddSum = sumOddAboveDiagonal(matrix);

        System.out.println("The number of negative elements below the main diagonal: " + negativeCount);
        System.out.println("The sum of odd elements above the main diagonal: " + oddSum);
    }

    public static int countNegativeBelowDiagonal(int[][] matrix) {
        int count = 0;
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int sumOddAboveDiagonal(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}